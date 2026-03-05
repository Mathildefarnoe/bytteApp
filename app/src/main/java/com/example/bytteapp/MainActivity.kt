package com.example.bytteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.bytteapp.ui.theme.BytteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BytteAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Velkommen Tilbage",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
// hej
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        color = Color.Blue,
        fontSize =30.sp,
        fontWeight = FontWeight.Bold,
        lineHeight =40.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BytteAppTheme {
        Greeting("Android")
    }
}