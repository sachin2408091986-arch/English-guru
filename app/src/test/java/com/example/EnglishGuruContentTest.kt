package com.example

import com.example.data.EnglishGuruContent
import com.example.data.LessonLevel
import com.example.data.WordCategory
import com.example.ui.QuizUiState
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

class EnglishGuruContentTest {

    @Test
    fun `lessons cover all standard levels up to std 8`() {
        assertEquals(12, EnglishGuruContent.lessons.size)
        LessonLevel.entries.forEach { level ->
            assertTrue(
                "Missing lessons for $level",
                EnglishGuruContent.lessons.any { it.level == level }
            )
        }
        assertNotNull(EnglishGuruContent.lessonById("active_passive_writing"))
    }

    @Test
    fun `vocabulary covers all categories with rich words`() {
        assertTrue(EnglishGuruContent.words.size >= 50)
        WordCategory.entries.forEach { cat ->
            assertTrue(
                "Missing words for $cat",
                EnglishGuruContent.words.any { it.category == cat }
            )
        }
    }

    @Test
    fun `every quiz answer exists in its options across all levels`() {
        assertEquals(18, EnglishGuruContent.questions.size)
        LessonLevel.entries.forEach { level ->
            assertTrue(EnglishGuruContent.questions.any { it.level == level })
        }
        EnglishGuruContent.questions.forEach { q ->
            assertTrue("Answer missing from options for ${q.id}", q.answer in q.options)
        }
    }

    @Test
    fun `quiz scorePercent calculates accurately`() {
        val levelQuestions = EnglishGuruContent.questions.filter { it.level == LessonLevel.STD_7_8 }
        val state = QuizUiState(questions = levelQuestions, score = 3)
        assertEquals(50, state.scorePercent)
    }
}
