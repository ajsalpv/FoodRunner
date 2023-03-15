package com.ajsal.foodrunnner

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LogIN : AppCompatActivity() {

    lateinit var txtfrone:TextView
    lateinit var etfrpassword:EditText
    lateinit var etfrmobile:EditText
    lateinit var txtfrtwo:TextView
    lateinit var btnfrloginbutton:Button
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)

        val isLoggedIn =sharedPreferences.getBoolean("isLoggedIn",false)
        setContentView(R.layout.activity_log_in)

        if (isLoggedIn){
            val intent = Intent(this,AfterButton::class.java)
            startActivity(intent)
            finish()
        }






        supportActionBar?.hide()


        btnfrloginbutton=findViewById(R.id.btnfrloginbutton)
        txtfrone=findViewById(R.id.txtfrone)
        txtfrtwo=findViewById(R.id.txtfrtwo)
        etfrmobile=findViewById(R.id.etfrmobile)
        etfrpassword=findViewById(R.id.etfrpassword)


        btnfrloginbutton.setOnClickListener {
            val mobile=etfrmobile.text.toString()
            val pass=etfrpassword.text.toString()

            val intent = Intent(this,AfterButton::class.java)
            savePreference()
            startActivity(intent)

            Toast.makeText(
                this,mobile,
                Toast.LENGTH_LONG).show()

            Toast.makeText(
                this,pass,
                Toast.LENGTH_LONG).show()



        }

        txtfrone.setOnClickListener{
            val intent=Intent( this,ForgotPassword::class.java)
            savePreference()
            startActivity(intent)
        }

        txtfrtwo.setOnClickListener{
            val inent=Intent( this,RegistrationPage::class.java)
            savePreference()
            startActivity(inent)
        }


    }

    override fun onPause() {
        super.onPause()
        finish()
    }

    fun savePreference(){
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
    }
}