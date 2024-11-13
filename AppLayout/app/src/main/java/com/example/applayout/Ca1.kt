package com.example.applayout

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class Ca1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca1)
        val btn = findViewById<Button>(R.id.btn1)
        btn.setOnClickListener {
            val msg = "Welcome Back"
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        }
    }
}