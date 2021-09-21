package com.andariadar.jetpackcomposelayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xff23036a))
                .align(Alignment.TopStart)
        ) {
            Text(
                text = "TopStart",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xff30009c))
                .align(Alignment.TopCenter)
        ) {
            Text(
                text = "TopCenter",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xff3700b3))
                .align(Alignment.TopEnd)
        ) {
            Text(
                text = "TopEnd",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center))
        }

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xff5600e8))
                .align(Alignment.CenterStart)
        ) {
            Text(
                text = "CenterStart",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xff6200ee))
                .align(Alignment.Center)
        ) {
            Text(
                text = "Center",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xff7f39fb))
                .align(Alignment.CenterEnd)
        ) {
            Text(
                text = "CenterEnd",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center))
        }

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xff985eff))
                .align(Alignment.BottomStart)
        ) {
            Text(
                text = "BottomStart",
                color = Color.Black,
                modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xffbb86fc))
                .align(Alignment.BottomCenter)
        ) {
            Text(
                text = "BottomCenter",
                color = Color.Black,
                modifier = Modifier.align(Alignment.Center))
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xffdbb2ff))
                .align(Alignment.BottomEnd)
        ) {
            Text(
                text = "BottomEnd",
                color = Color.Black,
                modifier = Modifier.align(Alignment.Center))
        }
    }

    /*Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {

        Text(
            text = "Text",
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 25.sp,
            modifier = Modifier
                .matchParentSize()
                .background(Color(0xffbb86fc)))
    }*/
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    MyApp()
}