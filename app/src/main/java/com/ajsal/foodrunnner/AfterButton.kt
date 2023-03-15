package com.ajsal.foodrunnner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AfterButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_button)

        supportActionBar?.hide()

    }
}