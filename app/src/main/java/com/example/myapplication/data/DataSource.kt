package com.example.myapplication.data

import android.annotation.SuppressLint
import com.example.myapplication.model.Article
import com.example.myapplication.model.Author
import com.example.myapplication.model.Food
import com.example.myapplication.model.Kind

object DataSource {
    private val kind1 = Kind("вид1","ааа")
    private val article1 = Article("","")
    private val author1 = Author("","", article1)
        @SuppressLint("ResourceType")
        val foods = listOf(
        Food("Name", kind1, "composition",
            "",1, author1, tags = listOf(), comments = listOf())
    )
}