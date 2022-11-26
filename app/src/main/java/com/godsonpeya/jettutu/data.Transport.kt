package com.godsonpeya.jettutu

import androidx.annotation.DrawableRes


val transportTypes = listOf(
    TransportType(1, "Отели", R.drawable.bed),
    TransportType(2, "Авиабилет", R.drawable.flight),
    TransportType(3, "Ж/д билет", R.drawable.train),
    TransportType(4, "Автобусы", R.drawable.autobuse),
    TransportType(5, "Электрички", R.drawable.electotrain),
    TransportType(6, "Туры", R.drawable.tree),
    TransportType(7, "Приключения", R.drawable.change),
    TransportType(8, "Командировки", R.drawable.mission),
    TransportType(9, "Аэроэкспрессы", R.drawable.star),
)


data class TransportType(var id: Int, var name: String, @DrawableRes var imageId: Int)