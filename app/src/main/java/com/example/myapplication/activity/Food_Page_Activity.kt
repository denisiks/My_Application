package com.example.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.myapplication.R

class Food_Page_Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_page_layout)
    }
    fun CommentClick(v:View)
    {
        val intent = Intent(this, CommentsActivity::class.java)
        startActivity(intent)
    }

}