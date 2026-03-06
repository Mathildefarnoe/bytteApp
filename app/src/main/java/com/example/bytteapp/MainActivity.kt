package com.example.bytteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bytteapp.ui.theme.BytteAppTheme
import kotlin.random.Random


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val fontFamily = FontFamily(
            Font(R.font.lora_variable_font_wght),
            Font(R.font.lora_italic_variable_font_wght)
        )

        setContent {
            Column {
                VelkommenHeader(fontFamily)
                LogInSection(fontFamily)
            }
        }
    }


    @Composable
    fun VelkommenHeader(fontFamily: FontFamily) {

        Box(
            modifier = Modifier.background(Color(0xFF88C4F6))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .background(
                        color = Color(0, 0, 1868),
                        shape = RoundedCornerShape(bottomStart = 100.dp, bottomEnd = 100.dp)
                    )
                    .padding(top = 40.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    "Velkommen\nTilbage ",
                    color = Color(0xFFF7A929),
                    fontSize = 50.sp,
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 60.sp,
                    modifier = Modifier.padding(start = 15.dp)
                )
            }
        }
    }
}


@Composable
fun LogInSection(fontFamily: FontFamily) {

    var textFieldStateEmail by remember {
        mutableStateOf("")
    }

    var textFieldStatePassword by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .background(Color(0xFF88C4F6))
            .fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp, vertical = 100.dp)
        ) {

            Text(
                "Email",
                color = Color(0xFF001868),
                fontSize = 30.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(0.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = textFieldStateEmail,
                label = {
                    Text("Brugernavn")
                },
                onValueChange = {
                    textFieldStateEmail = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(30.dp))

            Text(
                "Password",
                color = Color(0xFF001868),
                fontSize = 30.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(0.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextField(
                value = textFieldStatePassword,
                label = {
                    Text("Password")
                },
                onValueChange = {
                    textFieldStatePassword = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))


            Button(
                onClick = {

                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(180.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF0A2A66)
                ),
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(
                    text = "Log in",
                    fontSize = 20.sp
                )
            }
        }
    }
}
