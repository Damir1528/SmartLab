package com.example.smartlab_gazizov

import androidx.compose.foundation.layout.Column
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.smartlab_gazizov.ui.theme.SmartLab_GazizovTheme
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

class Login {

}

@Preview
@Composable
fun login()
{
    Column(
        modifier = Modifier
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        //Image(painter = painterResource(id = R.drawable.emojies), contentDescription = "")
        Text(text = "✋ Добро пожаловать!\n", fontSize=22.sp, fontFamily=FontFamily.Monospace)
    }
    Text(text = "Войдите, чтобы пользоваться функциями приложения\n", fontSize=22.sp, fontFamily=FontFamily.Monospace)
    Text(text = "Вход по Email", fontSize=16.sp, fontFamily=FontFamily.Monospace, color = Color.Gray)
    Text(text = "Войдите, чтобы пользоваться функциями приложения", fontSize=22.sp, fontFamily=FontFamily.Monospace)
}