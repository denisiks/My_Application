package com.example.myapplication.model

import java.util.*


data class Comment(
    val user : User,
    val date : Date,
    val text : String,
)
