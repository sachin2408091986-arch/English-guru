package com.example.data

import androidx.annotation.StringRes
import com.example.R

enum class LessonLevel(@StringRes val labelRes: Int) {
    STD_1_3(R.string.level_std_1_3),
    STD_4_6(R.string.level_std_4_6),
    STD_7_8(R.string.level_std_7_8)
}

enum class WordCategory(@StringRes val labelRes: Int) {
    SCHOOL(R.string.cat_school),
    DAILY(R.string.cat_daily),
    VERBS(R.string.cat_verbs),
    ADJECTIVES(R.string.cat_adjectives),
    NATURE(R.string.cat_nature)
}

data class LessonExample(
    val english: String,
    val gujarati: String,
    val note: String? = null
)

data class Lesson(
    val id: String,
    val title: String,
    val subtitle: String,
    val level: LessonLevel,
    val grammarNote: String? = null,
    val examples: List<LessonExample>
)

data class WordItem(
    val english: String,
    val gujarati: String,
    val pronunciation: String,
    val category: WordCategory
)

data class QuizQuestion(
    val id: String,
    val level: LessonLevel,
    val question: String,
    val options: List<String>,
    val answer: String,
    val meaning: String
)

object EnglishGuruContent {
    val lessons: List<Lesson> get() = LessonData.allLessons
    val words: List<WordItem> get() = VocabularyData.allWords
    val questions: List<QuizQuestion> get() = QuizData.allQuestions

    val dailyWords: List<WordItem> = listOf(
        WordItem("Good morning", "સુપ્રભાત", "ગુડ મોર્નિંગ", WordCategory.DAILY),
        WordItem("Knowledge", "જ્ઞાન", "નોલેજ", WordCategory.SCHOOL),
        WordItem("Honest", "પ્રામાણિક", "ઓનેસ્ટ", WordCategory.ADJECTIVES),
        WordItem("Environment", "પર્યાવરણ", "એન્વાયરન્મેન્ટ", WordCategory.NATURE),
        WordItem("Understand", "સમજવું", "અન્ડરસ્ટેન્ડ", WordCategory.VERBS),
        WordItem("Discipline", "શિસ્ત", "ડિસિપ્લિન", WordCategory.SCHOOL)
    )

    fun lessonById(id: String): Lesson? = lessons.find { it.id == id }
}
