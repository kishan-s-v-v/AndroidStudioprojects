package com.example.applayout

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GridLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_layout)
        var a = findViewById<ImageView>(R.id.imageView4)
        var b =findViewById<ImageView>(R.id.imageView6)
        var c = findViewById<ImageButton>(R.id.imageButton)
        var d = findViewById<ImageButton>(R.id.imageButton2)
        c.setOnClickListener {
            Toast.makeText(this, )
        }
    }
    }
