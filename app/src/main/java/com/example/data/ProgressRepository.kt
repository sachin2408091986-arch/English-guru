package com.example.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.guruDataStore: DataStore<Preferences> by preferencesDataStore(
    name = "english_guru_prefs"
)

data class GuruProgress(
    val completedLessonIds: Set<String> = emptySet(),
    val bestScore: Int = 0,
    val quizzesTaken: Int = 0
) {
    val completedCount: Int
        get() = completedLessonIds.size
}

class ProgressRepository(private val context: Context) {

    private object Keys {
        val COMPLETED_LESSON_IDS = stringSetPreferencesKey("completed_lesson_ids")
        val BEST_SCORE = intPreferencesKey("best_score")
        val QUIZZES_TAKEN = intPreferencesKey("quizzes_taken")
    }

    val progressFlow: Flow<GuruProgress> = context.guruDataStore.data.map { prefs ->
        GuruProgress(
            completedLessonIds = prefs[Keys.COMPLETED_LESSON_IDS] ?: emptySet(),
            bestScore = prefs[Keys.BEST_SCORE] ?: 0,
            quizzesTaken = prefs[Keys.QUIZZES_TAKEN] ?: 0
        )
    }

    suspend fun markLessonCompleted(lessonId: String) {
        context.guruDataStore.edit { prefs ->
            val updated = (prefs[Keys.COMPLETED_LESSON_IDS] ?: emptySet()) + lessonId
            prefs[Keys.COMPLETED_LESSON_IDS] = updated
        }
    }

    suspend fun recordQuizScore(scorePercent: Int) {
        context.guruDataStore.edit { prefs ->
            val currentBest = prefs[Keys.BEST_SCORE] ?: 0
            if (scorePercent > currentBest) {
                prefs[Keys.BEST_SCORE] = scorePercent
            }
            prefs[Keys.QUIZZES_TAKEN] = (prefs[Keys.QUIZZES_TAKEN] ?: 0) + 1
        }
    }

    suspend fun resetAllProgress() {
        context.guruDataStore.edit { prefs ->
            prefs.remove(Keys.COMPLETED_LESSON_IDS)
            prefs.remove(Keys.BEST_SCORE)
            prefs.remove(Keys.QUIZZES_TAKEN)
        }
    }
}
