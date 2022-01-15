package com.example.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.myapplication.R


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth_layout)

    }
    fun click(v:View ) {
        val intent = Intent(this, FoodsActivity::class.java)
        startActivity(intent)
    }


}



