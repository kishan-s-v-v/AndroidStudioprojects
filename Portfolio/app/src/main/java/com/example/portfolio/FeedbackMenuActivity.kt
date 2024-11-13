package com.example.portfolio

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeedbackMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback_menu)
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val feedbackMessage = intent.getStringExtra("FEEDBACK_KEY")
        val feedbackMessageTextView: TextView = findViewById(R.id.feedbackMessageTextView)
        feedbackMessageTextView.text = feedbackMessage ?: "We value your feedback!"
        val feedbackRatingBar: RatingBar = findViewById(R.id.feedbackRatingBar)
        val feedbackEditText: EditText = findViewById(R.id.feedbackEditText)
        val submitFeedbackButton: Button = findViewById(R.id.submitFeedbackButton)
        submitFeedbackButton.setOnClickListener {
            val rating = feedbackRatingBar.rating
            val feedback = feedbackEditText.text.toString()


            val message = "Rating: $rating\nFeedback: $feedback"
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            feedbackRatingBar.rating = 0f
            feedbackEditText.text.clear()
        }
        findViewById<Button>(R.id.backButton7).setOnClickListener {
            onBackPressed()
        }
    }
}