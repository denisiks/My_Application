package com.example.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.myapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_layout)
        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomBar.selectedItemId = R.id.page_3
        bottomBar.setOnNavigationItemSelectedListener() { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    val intent = Intent(this, ArticlesActivity::class.java)
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