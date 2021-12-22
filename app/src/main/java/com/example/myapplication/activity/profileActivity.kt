package com.example.myapplication.activity

import android.app.Activity
import android.os.Bundle
import com.example.myapplication.R

class profileActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_layout)
    }
}