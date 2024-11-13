package com.example.demo

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class alert_dialog_box : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_dialog_box)
        var b = findViewById<Button>(R.id.b2)
        b.setOnClickListener {
            var c = LayoutInflater.from(this).inflate(R.layout.custom_dialog,null)
            var d = AlertDialog.Builder(this).setView(c)
            d.setPositiveButton("Subscribe"){dialog,_ ->
                val e = findViewById<EditText>(R.id.e1)
                val email = e.text.toString()
                if (email.isNotBlank()){
                    Toast.makeText(this, "subscribed with $email", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "enter valid email", Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            d.setNegativeButton("Cancel"){dialog,_ -> dialog.dismiss()}
            d.create().show()
            
        }
    }
}