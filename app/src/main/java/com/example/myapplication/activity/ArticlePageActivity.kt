package com.example.myapplication.activity

import android.app.Activity
import android.os.Bundle
import com.example.myapplication.R

class ArticlePageActivity :Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.articlepage)
    }
}