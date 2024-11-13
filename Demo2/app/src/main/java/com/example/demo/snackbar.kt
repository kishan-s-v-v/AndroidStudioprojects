package com.example.applayout

import android.annotation.SuppressLint
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.demo.R
import com.google.android.material.snackbar.Snackbar

class snackbar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar)
        val snackbar = findViewById<Button>(R.id.btn2)
        snackbar.setOnClickListener { view ->
            Snackbar.make(view, "This is a sanckbar", Snackbar.LENGTH_LONG).setAction("Undo"){
                Toast.makeText(this, "Undo was clicked", Toast.LENGTH_SHORT).show()
            }.show()
        }
    }
}