package com.example.myapplication.model

import androidx.annotation.DrawableRes


data class User(
    @DrawableRes
    val userIconId : Int,
    val nickname: String
)
