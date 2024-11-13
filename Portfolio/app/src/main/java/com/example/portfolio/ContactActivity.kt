package com.example.portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        findViewById<Button>(R.id.backButton9).setOnClickListener {
            finish()
        }
        val contactInfo = intent.getStringExtra("CONTACT_KEY")
        val contactTextView: TextView = findViewById(R.id.contactTextView)
        contactTextView.text = contactInfo ?: "No contact info provided"
    }
}