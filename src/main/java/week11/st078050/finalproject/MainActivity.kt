package week11.st078050.finalproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import week11.st078050.finalproject.screens.SplashScreen
import week11.st078050.finalproject.ui.theme.FitTrackrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FitTrackrTheme {
                SplashScreen(
                    onLoginClick = {},
                    onRegisterClick = {},
                    onGuestClick = {}
                )
            }
        }
    }
}
