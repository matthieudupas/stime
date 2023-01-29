package com.example.stime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    private lateinit var myeditText: EditText
    private lateinit var email: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.wishes)
    }
}