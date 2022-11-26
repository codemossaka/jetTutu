package com.godsonpeya.jettutu.screens

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.godsonpeya.jettutu.component.Banner
import com.godsonpeya.jettutu.component.Entete
import com.godsonpeya.jettutu.component.TransportCard
import com.godsonpeya.jettutu.transportTypes
import com.godsonpeya.jettutu.R

@Composable
fun HomeScreen() {
    val context = LocalContext.current
   Scaffold(
       topBar = {
           TopAppBar(title ={}, navigationIcon = {
               Image(painter = painterResource(id = R.drawable.logo),
                   contentDescription = "logo",
                   modifier = Modifier.width(100.dp).clickable {
                       Toast.makeText(context, "Vous avez clique sur le logo", Toast.LENGTH_SHORT).show()
                   })
           }, actions = {
               Button(onClick = {
                   Toast.makeText(context, "Vous avez clique sur le button Войти", Toast.LENGTH_SHORT).show()
               },
                   border = BorderStroke(width = .5.dp, color = Color(0xFF1269AC)),
                   colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
                   Text(text = "Войти",
                       fontWeight = FontWeight.Bold,
                       color = Color(0xFF1348B3),
                       style = MaterialTheme.typography.h6)
               }

               IconButton(onClick = {
                   Toast.makeText(context, "Vous avez clique sur l'icon Menmu", Toast.LENGTH_SHORT).show()
               }) {
                   Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
               }
           } ,backgroundColor= Color.White)
       }
   ) { paddingValue->
       Surface(modifier = Modifier.padding(paddingValue)) {
           Column(modifier = Modifier.padding(horizontal = 10.dp)) {


               Spacer(modifier = Modifier.height(30.dp))

               Banner()


               Spacer(modifier = Modifier.height(30.dp))

               LazyVerticalGrid(columns = GridCells.Fixed(3), content = {

                   items(transportTypes) { transportType ->
                       TransportCard(transportType = transportType)
                   }

               })


               Spacer(modifier = Modifier.height(30.dp))

               Card(elevation = 2.dp) {
                   Row(horizontalArrangement = Arrangement.Center,
                       verticalAlignment = Alignment.CenterVertically,
                       modifier = Modifier
                           .fillMaxWidth()
                           .padding(vertical = 5.dp)) {
                       Icon(painter = painterResource(id = R.drawable.visa),
                           contentDescription = "visa",
                           modifier = Modifier.padding(end = 7.dp))
                       Icon(painter = painterResource(id = R.drawable.master),
                           contentDescription = "master",
                           modifier = Modifier.padding(end = 7.dp))
                       Icon(painter = painterResource(id = R.drawable.mir),
                           contentDescription = "mir",
                           modifier = Modifier.padding(end = 7.dp))
                       Text(text = "Безопасная оплата", color = Color(0xFF3DA112))
                   }
               }

               Spacer(modifier = Modifier.height(30.dp))

               Column(horizontalAlignment = Alignment.CenterHorizontally,
                   modifier = Modifier.fillMaxWidth()) {
                   Row {
                       Image(painter = painterResource(id = R.drawable.one),
                           contentDescription = "one")
                       Spacer(modifier = Modifier.width(10.dp))
                       Text(
                           text = buildAnnotatedString {
                               withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                   append("Туту.ру — российский\nсервис путешествий №1\n")
                               }
                               withStyle(style = SpanStyle(color = Color.Gray)) {
                                   append("По данным SimilarWeb, 2020 г.")
                               }

                           },
                       )
                   }
               }
               Spacer(modifier = Modifier.height(30.dp))

               Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                   Image(painter = painterResource(id = R.drawable.apple),
                       contentDescription = "apple", modifier= Modifier.scale(2f))
                   Spacer(modifier = Modifier.width(70.dp))
                   Image(painter = painterResource(id = R.drawable.android),
                       contentDescription = "android",
                       modifier = Modifier
                           .padding(start = 7.dp)
                           .scale(2f))
               }

           }
       }

   }
}