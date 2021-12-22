package com.example.myapplication.model


import androidx.annotation.DrawableRes

data class Food(
    val title : String,
    //val kind : Kind,
    val composition : String,
    @DrawableRes val coverResId : Int,
    val author : Author,
    val reciepe : String,
    val comments : List<Comment>
)

