package com.example.smartlab_gazizov

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Str1 {
}
@Preview
@Composable
fun str1()
{
    Column (modifier = Modifier.fillMaxSize()) {
        Text(text = "Анализы", fontSize=44.sp, fontFamily= FontFamily.Monospace, color = Color(0xFF00B712), modifier = Modifier.padding(start = 102.dp, top = 280.dp, end = 102.dp, bottom = 0.dp))
        Text(text = "Экспресс сбор и получение проб", fontSize = 16.sp, color = Color(0xFF939396), modifier = Modifier.padding(start = 70.dp, top = 30.dp, end = 0.dp, bottom = 20.dp))
    }
    Column (modifier = Modifier.fillMaxSize()) {
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Пропустить", fontSize = 18.sp, color = Color(0xFF57A9FF))
        }
    }
    Column(modifier = Modifier.fillMaxSize(2f))
    {
        Image(modifier = Modifier.padding(start = 150.dp, top = 420.dp, end = 150.dp, bottom = 300.dp).width(100.dp), painter = painterResource(id = R.drawable.image2), contentDescription = "", contentScale = ContentScale.FillWidth)
    }
}
