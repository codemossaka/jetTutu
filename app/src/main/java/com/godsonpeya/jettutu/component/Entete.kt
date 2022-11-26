package com.godsonpeya.jettutu.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.godsonpeya.jettutu.R

@Composable
fun Entete() {

    Row(horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()) {


        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier.width(100.dp))


        Row() {
            Button(onClick = { /*TODO*/ },
                border = BorderStroke(width = .5.dp, color = Color(0xFF1269AC)),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
                Text(text = "Войти",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1348B3),
                    style = MaterialTheme.typography.h6)
            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
            }
        }
    }
}