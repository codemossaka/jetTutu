package com.godsonpeya.jettutu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.godsonpeya.jettutu.screens.HomeScreen
import com.godsonpeya.jettutu.ui.theme.JetTutuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetTutuTheme {
                // A surface container using the 'background' color from the theme
                TutuHomeScreen()
            }
        }
    }
}

@Composable
fun TutuHomeScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        HomeScreen()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetTutuTheme {

    }
}