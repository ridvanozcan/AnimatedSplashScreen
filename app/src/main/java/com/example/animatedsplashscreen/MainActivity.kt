package com.example.animatedsplashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.animatedsplashscreen.navigation.SetupNavGraph
import com.example.animatedsplashscreen.ui.theme.AnimatedSplashScreenTheme

class MainActivity  : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

@Composable
fun Content() {
    AnimatedSplashScreenTheme {
        val navController = rememberNavController()
        SetupNavGraph(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun AnimatedSplashScreenPreview() {
    Content()
}