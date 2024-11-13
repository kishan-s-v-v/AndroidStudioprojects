package com.example.portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EmailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)
        findViewById<Button>(R.id.backButton8).setOnClickListener {
            finish()
        }
        val email = intent.getStringExtra("EMAIL_KEY")
        val emailTextView: TextView = findViewById(R.id.emailTextView)
        emailTextView.text = email ?: "No email provided"
    }
}