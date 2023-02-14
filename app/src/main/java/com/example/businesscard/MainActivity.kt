package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Surface(color = Color(0xFF284E64)) {
        MiddleContent()
        BottomContent()
    }

}

@Composable
fun MiddleContent() {
    val androidLogo = painterResource(R.drawable.android_icon_transparent_background_9)
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 160.dp)
    ) {
        Image(
            painter = androidLogo,
            contentDescription = null,
            modifier = Modifier.size(120.dp)
        )
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(text = "Michael Rodrigo", fontSize = 40.sp)
        Text(text = "Android Developer", fontSize = 24.sp, color = Color(0xFF97B823))
    }
}

@Composable
fun BottomContent() {
    val emailIcon = painterResource(R.drawable.baseline_email_24)
    val phoneIcon = painterResource(R.drawable.baseline_call_24)
    val instagramIcon = painterResource(R.drawable.icons8_instagram)
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(start = 56.dp, bottom = 32.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = phoneIcon,
                contentDescription = null,
                tint = Color(0xFF97B823),
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = "+48 562 867 233", fontSize = 24.sp)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Icon(
                painter = instagramIcon,
                contentDescription = null,
                tint = Color(0xFF97B823),
                modifier = Modifier
                    .padding(end = 8.dp)
                    .size(24.dp)
            )
            Text(text = "@Instagram", fontSize = 24.sp)
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Icon(
                painter = emailIcon,
                contentDescription = null,
                tint = Color(0xFF97B823),
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = "R0dr1g3z@gmail.com", fontSize = 24.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            BusinessCard()
        }
    }
}