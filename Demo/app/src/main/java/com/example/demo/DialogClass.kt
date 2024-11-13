package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DialogClass : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialog_class)
        var btndialog = findViewById<Button>(R.id.b1)
        var ratbar = findViewById<RatingBar>(R.id.ratingBar)
        btndialog.setOnClickListener {
            var b = AlertDialog.Builder(this)
            b.setTitle("Exit")
            b.setMessage("Do you really want to exit")
            b.setCancelable(false)
            b.setPositiveButton("Yes"){dialog,_ -> finish()}
            b.setNegativeButton("No"){dialog,_ -> dialog.dismiss()}
                run {
                    Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
                }
            b.create().show()
        }
    }
}