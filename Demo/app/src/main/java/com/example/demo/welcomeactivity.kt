package com.example.demo

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    private lateinit var welcomeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcomeactivity)

        welcomeTextView = findViewById(R.id.welcome_text_view)

        // Get the intent that started this activity
        val intent = intent
        val name = intent.getStringExtra("name")
        val gender = intent.getStringExtra("gender")

        // Display the received data
        welcomeTextView.text = "Welcome, $name ($gender)!"

        // Show a toast message to confirm data reception
        Toast.makeText(this, "Data received successfully!", Toast.LENGTH_SHORT).show()

        // Log the received data
        Log.d("WelcomeActivity", "Name: $name, Gender: $gender")
    }
}