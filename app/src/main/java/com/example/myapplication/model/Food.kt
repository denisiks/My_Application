package com.example.myapplication.model

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes

@SuppressLint("SupportAnnotationUsage")
data class Food(
    val title : String,
    val kind : Kind,
    val composition : String,
    val reciepe : String,
    @DrawableRes
    val coverResId : Int,
    val author : Author,
    val tags : List<Tag>,
    val comments : List<Comment> ,

)

