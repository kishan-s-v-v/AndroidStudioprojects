package com.example.demo

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_app : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app)
        val shareBtn = findViewById<Button>(R.id.btn7)
        val checkBox1 = findViewById<CheckBox>(R.id.ch1)
        val checkBox2 = findViewById<CheckBox>(R.id.ch2)
        val checkBox3 = findViewById<CheckBox>(R.id.ch3)
        val checkBox4 = findViewById<CheckBox>(R.id.ch4)
        val checkBox5 = findViewById<CheckBox>(R.id.ch5)
        shareBtn.setOnClickListener {
            val selectedQuotes = mutableListOf<String>()
            if (checkBox1.isChecked) selectedQuotes.add(checkBox1.text.toString())
            if (checkBox2.isChecked) selectedQuotes.add(checkBox2.text.toString())
            if (checkBox3.isChecked) selectedQuotes.add(checkBox3.text.toString())
            if (checkBox4.isChecked) selectedQuotes.add(checkBox4.text.toString())
            if (checkBox5.isChecked) selectedQuotes.add(checkBox5.text.toString())
            if (selectedQuotes.isNotEmpty()) {
                val quotesToShare = selectedQuotes.joinToString("\n")
                copyToClipboard(quotesToShare)
                shareToBrowser(quotesToShare)
            } else {
                Toast.makeText(this, "Please select at least one quote", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun copyToClipboard(text: String) {
        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("Quotes", text)
        clipboard.setPrimaryClip(clip)
        Toast.makeText(this, "Quotes copied to clipboard", Toast.LENGTH_SHORT).show()
    }

    private fun shareToBrowser(text: String) {
        val sendIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, text)
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }
}