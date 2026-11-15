package com.example.ui.navigation

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Quiz
import androidx.compose.material.icons.filled.Translate
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.MenuBook
import androidx.compose.material.icons.outlined.Quiz
import androidx.compose.material.icons.outlined.Translate
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.NavigationRailItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.R
import com.example.data.EnglishGuruContent
import com.example.ui.EnglishGuruViewModel
import com.example.ui.screens.HomeScreen
import com.example.ui.screens.LessonDetailScreen
import com.example.ui.screens.LessonsScreen
import com.example.ui.screens.ProgressScreen
import com.example.ui.screens.QuizScreen
import com.example.ui.screens.WordsScreen

object GuruRoutes {
    const val HOME = "home"
    const val LESSONS = "lessons"
    const val LESSON_DETAIL = "lesson_detail/{lessonId}"
    const val WORDS = "words"
    const val QUIZ = "quiz"
    const val PROGRESS = "progress"

    fun lessonDetail(lessonId: String): String = "lesson_detail/$lessonId"
}

enum class GuruDestination(
    val route: String,
    @StringRes val labelRes: Int,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
) {
    HOME(GuruRoutes.HOME, R.string.nav_home, Icons.Filled.Home, Icons.Outlined.Home),
    LESSONS(GuruRoutes.LESSONS, R.string.nav_lessons, Icons.Filled.MenuBook, Icons.Outlined.MenuBook),
    WORDS(GuruRoutes.WORDS, R.string.nav_words, Icons.Filled.Translate, Icons.Outlined.Translate),
    QUIZ(GuruRoutes.QUIZ, R.string.nav_quiz, Icons.Filled.Quiz, Icons.Outlined.Quiz),
    PROGRESS(GuruRoutes.PROGRESS, R.string.nav_progress, Icons.Filled.BarChart, Icons.Outlined.BarChart)
}

@Composable
fun EnglishGuruAppShell(
    viewModel: EnglishGuruViewModel,
    onSpeak: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route ?: GuruRoutes.HOME

    val progress by viewModel.progress.collectAsStateWithLifecycle()
    val lessons by viewModel.filteredLessons.collectAsStateWithLifecycle()
    val selectedLessonLevel by viewModel.selectedLessonLevel.collectAsStateWithLifecycle()
    val words by viewModel.filteredWords.collectAsStateWithLifecycle()
    val searchQuery by viewModel.searchQuery.collectAsStateWithLifecycle()
    val selectedWordCategory by viewModel.selectedWordCategory.collectAsStateWithLifecycle()
    val dailyWordIndex by viewModel.dailyWordIndex.collectAsStateWithLifecycle()
    val quizState by viewModel.quizState.collectAsStateWithLifecycle()
    val speakingText by viewModel.speakingText.collectAsStateWithLifecycle()

    val navigateToTab: (String) -> Unit = { route ->
        navController.navigate(route) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

    val isDetailRoute = currentRoute.startsWith("lesson_detail")

    BoxWithConstraints(modifier = modifier.fillMaxSize()) {
        val useNavigationRail = maxWidth >= 600.dp

        Scaffold(
            containerColor = MaterialTheme.colorScheme.background,
            contentWindowInsets = WindowInsets.safeDrawing,
            bottomBar = {
                if (!useNavigationRail && !isDetailRoute) {
                    NavigationBar(
                        containerColor = MaterialTheme.colorScheme.surface,
                        tonalElevation = 2.dp
                    ) {
                        GuruDestination.entries.forEach { dest ->
                            val selected = currentRoute == dest.route
                            val label = stringResource(dest.labelRes)
                            NavigationBarItem(
                                selected = selected,
                                onClick = { navigateToTab(dest.route) },
                                icon = {
                                    Icon(
                                        imageVector = if (selected) dest.selectedIcon else dest.unselectedIcon,
                                        contentDescription = label
                                    )
                                },
                                label = {
                                    Text(
                                        text = label,
                                        style = MaterialTheme.typography.labelMedium,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                },
                                colors = NavigationBarItemDefaults.colors(
                                    selectedIconColor = MaterialTheme.colorScheme.primary,
                                    selectedTextColor = MaterialTheme.colorScheme.primary,
                                    indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                                ),
                                modifier = Modifier.testTag("nav_bar_${dest.route}")
                            )
                        }
                    }
                }
            }
        ) { innerPadding ->
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                if (useNavigationRail && !isDetailRoute) {
                    NavigationRail(
                        containerColor = MaterialTheme.colorScheme.surface
                    ) {
                        GuruDestination.entries.forEach { dest ->
                            val selected = currentRoute == dest.route
                            val label = stringResource(dest.labelRes)
                            NavigationRailItem(
                                selected = selected,
                                onClick = { navigateToTab(dest.route) },
                                icon = {
                                    Icon(
                                        imageVector = if (selected) dest.selectedIcon else dest.unselectedIcon,
                                        contentDescription = label
                                    )
                                },
                                label = {
                                    Text(
                                        text = label,
                                        style = MaterialTheme.typography.labelMedium
                                    )
                                },
                                colors = NavigationRailItemDefaults.colors(
                                    selectedIconColor = MaterialTheme.colorScheme.primary,
                                    selectedTextColor = MaterialTheme.colorScheme.primary,
                                    indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                                ),
                                modifier = Modifier.testTag("nav_rail_${dest.route}")
                            )
                        }
                    }
                }

                NavHost(
                    navController = navController,
                    startDestination = GuruRoutes.HOME,
                    modifier = Modifier.weight(1f)
                ) {
                    composable(GuruRoutes.HOME) {
                        HomeScreen(
                            progress = progress,
                            dailyWordIndex = dailyWordIndex,
                            speakingText = speakingText,
                            onCycleDailyWord = viewModel::cycleDailyWord,
                            onStartLearning = { navigateToTab(GuruRoutes.LESSONS) },
                            onTakeQuiz = { navigateToTab(GuruRoutes.QUIZ) },
                            onSpeakWord = onSpeak
                        )
                    }
                    composable(GuruRoutes.LESSONS) {
                        LessonsScreen(
                            lessons = lessons,
                            selectedLevel = selectedLessonLevel,
                            completedLessonIds = progress.completedLessonIds,
                            onSelectLevel = viewModel::selectLessonLevel,
                            onOpenLesson = { lesson ->
                                navController.navigate(GuruRoutes.lessonDetail(lesson.id))
                            }
                        )
                    }
                    composable(
                        route = GuruRoutes.LESSON_DETAIL,
                        arguments = listOf(navArgument("lessonId") { type = NavType.StringType })
                    ) { entry ->
                        val lessonId = entry.arguments?.getString("lessonId").orEmpty()
                        val lesson = EnglishGuruContent.lessonById(lessonId) ?: EnglishGuruContent.lessons.first()
                        LessonDetailScreen(
                            lesson = lesson,
                            isCompleted = lesson.id in progress.completedLessonIds,
                            speakingText = speakingText,
                            onBack = { navController.popBackStack() },
                            onSpeak = onSpeak,
                            onComplete = {
                                viewModel.markLessonCompleted(lesson.id)
                                navController.popBackStack()
                            }
                        )
                    }
                    composable(GuruRoutes.WORDS) {
                        WordsScreen(
                            words = words,
                            searchQuery = searchQuery,
                            selectedCategory = selectedWordCategory,
                            speakingText = speakingText,
                            onSearchQueryChange = viewModel::updateSearchQuery,
                            onSelectCategory = viewModel::selectWordCategory,
                            onSpeak = onSpeak
                        )
                    }
                    composable(GuruRoutes.QUIZ) {
                        QuizScreen(
                            state = quizState,
                            onSelectLevel = viewModel::selectQuizLevel,
                            onStartQuiz = viewModel::startQuiz,
                            onSelectOption = viewModel::selectQuizOption,
                            onAdvanceQuiz = viewModel::advanceQuiz,
                            onSaveScore = viewModel::saveQuizScore,
                            onResetQuiz = viewModel::resetQuiz
                        )
                    }
                    composable(GuruRoutes.PROGRESS) {
                        ProgressScreen(
                            progress = progress,
                            onResetProgress = viewModel::resetAllProgress
                        )
                    }
                }
            }
        }
    }
}
