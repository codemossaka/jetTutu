package com.godsonpeya.jettutu.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.godsonpeya.jettutu.TransportType


@Composable
fun TransportCard(transportType: TransportType) {
    Card(elevation = 5.dp,
        backgroundColor = Color(0xFFFAF8F8),
        modifier = Modifier.padding(5.dp)) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(120.dp)
                .height(70.dp)) {
            Image(painter = painterResource(id = transportType.imageId), contentDescription = "bed")
            Text(text = transportType.name, color = Color.Blue)
        }
    }
}