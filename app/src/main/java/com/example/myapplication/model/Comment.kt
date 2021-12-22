package com.example.myapplication.model


data class Comment(
    val user : User,
    val date : String,
    val text : String,
)
