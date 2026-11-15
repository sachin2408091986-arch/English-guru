package com.example

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.EnglishGuruViewModel
import com.example.ui.navigation.EnglishGuruAppShell
import com.example.ui.theme.EnglishGuruTheme
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: EnglishGuruViewModel = viewModel()
            val context = LocalContext.current

            val tts = remember {
                var engine: TextToSpeech? = null
                engine = TextToSpeech(context) { status ->
                    if (status == TextToSpeech.SUCCESS) {
                        engine?.language = Locale.US
                        engine?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
                            override fun onStart(utteranceId: String?) {
                                // Handled when speak() starts
                            }

                            override fun onDone(utteranceId: String?) {
                                viewModel.setSpeakingText(null)
                            }

                            @Deprecated("Deprecated in Java")
                            override fun onError(utteranceId: String?) {
                                viewModel.setSpeakingText(null)
                            }

                            override fun onError(utteranceId: String?, errorCode: Int) {
                                viewModel.setSpeakingText(null)
                            }
                        })
                    }
                }
                engine
            }

            DisposableEffect(tts) {
                onDispose {
                    tts.stop()
                    tts.shutdown()
                }
            }

            EnglishGuruTheme {
                EnglishGuruAppShell(
                    viewModel = viewModel,
                    onSpeak = { text ->
                        viewModel.setSpeakingText(text)
                        tts.language = Locale.US
                        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, "english_guru_$text")
                    }
                )
            }
        }
    }
}
