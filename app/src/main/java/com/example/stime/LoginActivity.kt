package com.example.stime

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.stime.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }

    fun onClickLogin(view: View){
        //id and password matching function
        val textId = findViewById<EditText>(R.id.email_login)
        val textPass = findViewById<EditText>(R.id.password_login)

        if(textId.text.toString() == "user" && textPass.text.toString() == "password"){
            Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Login failed", Toast.LENGTH_LONG).show()
        }
    }

    fun onClickRegister(view: View){
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

    fun onClickForgottenPassword(view: View){
        val intent = Intent(this, ForgottenPasswordActivity::class.java)
        startActivity(intent)
    }

}