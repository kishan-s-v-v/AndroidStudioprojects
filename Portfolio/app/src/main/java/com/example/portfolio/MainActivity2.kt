package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.widget.ImageButton


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        findViewById<ImageButton>(R.id.academicButton).setOnClickListener {
            startActivity(Intent(this, Academic::class.java))
        }
        findViewById<ImageButton>(R.id.hobbiesButton).setOnClickListener {
            startActivity(Intent(this, HobbiesActivity::class.java))
        }
        findViewById<ImageButton>(R.id.projectsButton).setOnClickListener {
            startActivity(Intent(this, ProjectsActivity::class.java))
        }
        findViewById<ImageButton>(R.id.skillsButton).setOnClickListener {
            startActivity(Intent(this, SkillsActivity::class.java))
        }
        findViewById<ImageButton>(R.id.certificatesButton).setOnClickListener {
            startActivity(Intent(this, CertificatesActivity::class.java))
        }
        findViewById<ImageButton>(R.id.feedbackButton).setOnClickListener {
            startActivity(Intent(this, FeedbackActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_email -> {
                val email = "kishanchandaluri@gmail.com"
                val intent = Intent(this, EmailActivity::class.java).apply {
                    putExtra("EMAIL_KEY", email)
                }
                startActivity(intent)
                true
            }
            R.id.action_contact -> {
                val contactInfo = "Contact: 7989350585"
                val intent = Intent(this, ContactActivity::class.java).apply {
                    putExtra("CONTACT_KEY", contactInfo)
                }
                startActivity(intent)
                true
            }
            R.id.action_feedback -> {
                val feedbackMessage = "Your feedback is important!"
                val intent = Intent(this, FeedbackMenuActivity::class.java).apply {
                    putExtra("FEEDBACK_KEY", feedbackMessage)
                }
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}