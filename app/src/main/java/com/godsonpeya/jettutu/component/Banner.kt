package com.godsonpeya.jettutu.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.godsonpeya.jettutu.R

@Composable
fun Banner() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Больше пользы для ваших путешествий",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(6.dp)
        )


        Card(elevation = 3.dp) {
            Row(verticalAlignment = Alignment.CenterVertically) {

                Box(modifier = Modifier.background(Color(0xE4EEC8C8))) {
                    Image(painter = painterResource(id = R.drawable.banner),
                        contentDescription = "banner")
                }

                Spacer(modifier = Modifier.width(40.dp))
                Column(verticalArrangement = Arrangement.Center) {
                    Text(text = "Гарантия заселения Туту",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.h5)
                    Text(text = "Бесплатно найдём другой отель или вернём деньги")
                }

            }
        }

    }
}