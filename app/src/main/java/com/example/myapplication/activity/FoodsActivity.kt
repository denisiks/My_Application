package com.example.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.FoodAdapter
import com.example.myapplication.data.DataSource
import com.google.android.material.bottomnavigation.BottomNavigationView

class FoodsActivity : Activity() {
    companion object {
        const val KEY_NAME = "name"
        const val KEY_DESCRIPTION = "description"
        const val KEY_ICON_RES_ID = "iconresid"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.items_pizzas)
        val rvFoods = findViewById<RecyclerView>(R.id.rvFoods)
        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomBar.selectedItemId = R.id.page_2
        rvFoods.layoutManager = LinearLayoutManager(this)
        rvFoods.adapter = FoodAdapter(DataSource.foods) { (name, description, iconresid) ->
            val intent = Intent(this, Food_Page_Activity::class.java)
            intent.putExtra(FoodsActivity.KEY_NAME, name)
            intent.putExtra(FoodsActivity.KEY_DESCRIPTION, description)
            intent.putExtra(FoodsActivity.KEY_ICON_RES_ID, iconresid)

            startActivity(intent)

        }
        bottomBar.setOnNavigationItemSelectedListener() { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    val intent = Intent(this, ArticlesActivity::class.java)
                    startActivity(intent)
                    true

                }
                R.id.page_3 -> {
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
        }
    }

