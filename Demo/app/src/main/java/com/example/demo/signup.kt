package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var genderEditText: EditText
    private lateinit var signUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        nameEditText = findViewById(R.id.name_edit_text)
        genderEditText = findViewById(R.id.gender_edit_text)
        signUpButton = findViewById(R.id.sign_up_button)

        signUpButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val gender = genderEditText.text.toString()


            val intent = Intent(this, WelcomeActivity::class.java).apply {
                putExtra("name", name)
                putExtra("gender", gender)
            }
            startActivity(intent)
            Toast.makeText(this, "Navigating to Welcome Activity", Toast.LENGTH_SHORT).show()
        }
    }
}