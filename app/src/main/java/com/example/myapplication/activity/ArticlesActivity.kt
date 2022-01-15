package com.example.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.ArticleAdapter
import com.example.myapplication.data.DataSource
import com.google.android.material.bottomnavigation.BottomNavigationView

class ArticlesActivity : Activity() {
    companion object {
        const val KEY_NAME = "name"
        const val KEY_DESCRIPTION = "description"
        const val KEY_DATE = "date"
        const val KEY_AUTHOR = "author"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.items_articles)
        val rvArticles = findViewById<RecyclerView>(R.id.rvArticles)
        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomBar.selectedItemId = R.id.page_1
        rvArticles.layoutManager = LinearLayoutManager(this)
        rvArticles.adapter =
            ArticleAdapter(DataSource.articles) { (name, description, date, author) ->
                val intent = Intent(this, ArticlePageActivity::class.java)
                intent.putExtra(KEY_NAME, name)
                intent.putExtra(KEY_DESCRIPTION, description)
                intent.putExtra(KEY_DATE, date)
                intent.putExtra(KEY_AUTHOR, author.name + author.lastname)

                startActivity(intent)
            }
        bottomBar.setOnNavigationItemSelectedListener() { item ->
            when (item.itemId) {
                R.id.page_3 -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true

                }
                R.id.page_2 -> {
                    val intent = Intent(this, FoodsActivity::class.java)
                    startActivity(intent)
                    true
                }

                else -> false
            }
        }
    }
}