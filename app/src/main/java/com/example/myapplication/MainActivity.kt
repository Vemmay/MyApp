package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    // State to track if the text should be displayed
    var showText by remember { mutableStateOf(false) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
            ) {
                Button(onClick = { showText = true }) { //set display to true
                    Text("Click Me")
                }
                if (showText) {
                    Text("Hello World!")
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingScreenPreview() {
    MyApplicationTheme {
        Greeting()
    }
}
