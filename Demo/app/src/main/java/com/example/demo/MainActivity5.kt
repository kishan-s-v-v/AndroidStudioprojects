package com.example.demo

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        var btnlogentry = findViewById<Button>(R.id.btnlog)
        btnlogentry.setOnClickListener{
            Log.v(TAG,"verbose log: lowest priority, detailed entry, no use during production")
            Log.v(TAG,"Debug log: highest priority, This is used to debug the app")
            Log.v(TAG,"Info log: moderate level important,they give information of ... ")
            Log.v(TAG,"Warning log: This is a warning message for unexpected behaviour ")
        }
    }
}