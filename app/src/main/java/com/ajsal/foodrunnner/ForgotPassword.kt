package com.ajsal.foodrunnner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        supportActionBar?.hide()
    }
}