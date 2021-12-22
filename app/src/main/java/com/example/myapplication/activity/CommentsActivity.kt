package com.example.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.CommentAdapter
import com.example.myapplication.data.DataSource

class CommentsActivity:Activity() {
    companion object {
        const val KEY_Author = "user"
        const val KEY_DATE = "date"
        const val KEY_DESCRIPTION = "description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.items_comments)
        val rvComments = findViewById<RecyclerView>(R.id.rvComments)
        rvComments.layoutManager = LinearLayoutManager(this)
        rvComments.adapter = CommentAdapter(DataSource.comments) { (user, date, description ) ->
            val intent = Intent(this, Food_Page_Activity::class.java)
            intent.putExtra(KEY_Author, user.userIconId)
            intent.putExtra(KEY_Author, user.nickname)
            intent.putExtra(KEY_DATE, date)
            intent.putExtra(KEY_DESCRIPTION, description)
            startActivity(intent)
        }
    }
}