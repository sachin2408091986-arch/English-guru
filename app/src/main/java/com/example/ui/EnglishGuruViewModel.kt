package com.example.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.EnglishGuruContent
import com.example.data.GuruProgress
import com.example.data.Lesson
import com.example.data.LessonLevel
import com.example.data.ProgressRepository
import com.example.data.QuizQuestion
import com.example.data.WordCategory
import com.example.data.WordItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class QuizUiState(
    val selectedLevel: LessonLevel? = null,
    val questions: List<QuizQuestion> = EnglishGuruContent.questions,
    val started: Boolean = false,
    val questionIndex: Int = 0,
    val score: Int = 0,
    val selectedOption: String? = null,
    val finished: Boolean = false,
    val scoreSaved: Boolean = false
) {
    val totalQuestions: Int
        get() = questions.size

    val currentQuestion: QuizQuestion
        get() = questions[questionIndex.coerceIn(0, (totalQuestions - 1).coerceAtLeast(0))]

    val scorePercent: Int
        get() = if (totalQuestions > 0) (score * 100) / totalQuestions else 0
}

class EnglishGuruViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = ProgressRepository(application.applicationContext)

    val progress: StateFlow<GuruProgress> = repository.progressFlow
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.Eagerly,
            initialValue = GuruProgress()
        )

    private val _selectedLessonLevel = MutableStateFlow<LessonLevel?>(null)
    val selectedLessonLevel: StateFlow<LessonLevel?> = _selectedLessonLevel.asStateFlow()

    val filteredLessons: StateFlow<List<Lesson>> = _selectedLessonLevel
        .combine(MutableStateFlow(EnglishGuruContent.lessons)) { level, lessons ->
            if (level == null) lessons else lessons.filter { it.level == level }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = EnglishGuruContent.lessons
        )

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedWordCategory = MutableStateFlow<WordCategory?>(null)
    val selectedWordCategory: StateFlow<WordCategory?> = _selectedWordCategory.asStateFlow()

    val filteredWords: StateFlow<List<WordItem>> = combine(
        _searchQuery,
        _selectedWordCategory,
        MutableStateFlow(EnglishGuruContent.words)
    ) { query, category, allWords ->
        val trimmed = query.trim()
        allWords.filter { word ->
            val matchesCategory = category == null || word.category == category
            val matchesQuery = trimmed.isEmpty() ||
                word.english.contains(trimmed, ignoreCase = true) ||
                word.gujarati.contains(trimmed, ignoreCase = true) ||
                word.pronunciation.contains(trimmed, ignoreCase = true)
            matchesCategory && matchesQuery
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = EnglishGuruContent.words
    )

    private val _dailyWordIndex = MutableStateFlow(0)
    val dailyWordIndex: StateFlow<Int> = _dailyWordIndex.asStateFlow()

    private val _quizState = MutableStateFlow(QuizUiState())
    val quizState: StateFlow<QuizUiState> = _quizState.asStateFlow()

    private val _speakingText = MutableStateFlow<String?>(null)
    val speakingText: StateFlow<String?> = _speakingText.asStateFlow()

    fun selectLessonLevel(level: LessonLevel?) {
        _selectedLessonLevel.value = level
    }

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun selectWordCategory(category: WordCategory?) {
        _selectedWordCategory.value = category
    }

    fun cycleDailyWord() {
        _dailyWordIndex.update { (it + 1) % EnglishGuruContent.dailyWords.size }
    }

    fun markLessonCompleted(lessonId: String) {
        viewModelScope.launch {
            repository.markLessonCompleted(lessonId)
        }
    }

    fun selectQuizLevel(level: LessonLevel?) {
        val list = if (level == null) {
            EnglishGuruContent.questions
        } else {
            EnglishGuruContent.questions.filter { it.level == level }
        }
        _quizState.value = QuizUiState(
            selectedLevel = level,
            questions = list,
            started = false
        )
    }

    fun startQuiz() {
        val currentLevel = _quizState.value.selectedLevel
        val list = if (currentLevel == null) {
            EnglishGuruContent.questions
        } else {
            EnglishGuruContent.questions.filter { it.level == currentLevel }
        }
        _quizState.value = QuizUiState(
            selectedLevel = currentLevel,
            questions = list,
            started = true
        )
    }

    fun selectQuizOption(option: String) {
        _quizState.update { state ->
            if (state.selectedOption != null || state.finished || state.questions.isEmpty()) return@update state
            val isCorrect = option == state.currentQuestion.answer
            state.copy(
                selectedOption = option,
                score = if (isCorrect) state.score + 1 else state.score
            )
        }
    }

    fun advanceQuiz() {
        _quizState.update { state ->
            if (state.questionIndex >= state.totalQuestions - 1) {
                state.copy(finished = true)
            } else {
                state.copy(
                    questionIndex = state.questionIndex + 1,
                    selectedOption = null
                )
            }
        }
    }

    fun saveQuizScore() {
        val current = _quizState.value
        if (current.scoreSaved) return
        _quizState.update { it.copy(scoreSaved = true) }
        viewModelScope.launch {
            repository.recordQuizScore(current.scorePercent)
        }
    }

    fun resetQuiz() {
        selectQuizLevel(_quizState.value.selectedLevel)
    }

    fun resetAllProgress() {
        viewModelScope.launch {
            repository.resetAllProgress()
        }
    }

    fun setSpeakingText(text: String?) {
        _speakingText.value = text
    }
}
