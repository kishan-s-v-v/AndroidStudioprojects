package com.example.app_snackbar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demo.R
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        var snackbargl = findViewById<GridLayout>(R.id.sbgl1)
        var snackbarbtn1 = findViewById<ImageButton>(R.id.sbibtn1)
        var snackbarbtn2 = findViewById<ImageButton>(R.id.sbibtn2)
        var snackbarbtn3 = findViewById<ImageButton>(R.id.sbibtn3)
        var snackbarbtn4 = findViewById<ImageButton>(R.id.sbibtn4)
        var snackbarbtn5 = findViewById<ImageButton>(R.id.sbibtn5)
        var snackbarbtn6 = findViewById<ImageButton>(R.id.sbibtn6)

        snackbarbtn1.setOnClickListener { view ->
            Snackbar.make(view, "You selected MBA", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("MBA", R.drawable.mba) // Pass the stream name and image resource
            }.show()
        }

        snackbarbtn2.setOnClickListener { view ->
            Snackbar.make(view, "You selected EEE", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("EEE", R.drawable.eee) // Pass the stream name and image resource
            }.show()
        }

        snackbarbtn3.setOnClickListener { view ->
            Snackbar.make(view, "You selected MECH", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("MECH", R.drawable.mech) // Pass the stream name and image resource
            }.show()
        }

        snackbarbtn4.setOnClickListener { view ->
            Snackbar.make(view, "You selected IT", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("IT", R.drawable.it) // Pass the stream name and image resource
            }.show()
        }

        snackbarbtn5.setOnClickListener { view ->
            Snackbar.make(view, "You selected BUSINESS", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("BUSINESS", R.drawable.business) // Pass the stream name and image resource
            }.show()
        }

        snackbarbtn6.setOnClickListener { view ->
            Snackbar.make(view, "You selected CIVIL", Snackbar.LENGTH_LONG).setAction("Open") {
                openStreamDetail("CIVIL", R.drawable.civil) // Pass the stream name and image resource
            }.show()

        }




    }
    // Function to replace current layout with the selected stream details
    @SuppressLint("MissingInflatedId")
    private fun openStreamDetail(streamName: String, imageResId: Int) {
        setContentView(R.layout.layout_stream_detail)

        val streamTitle = findViewById<TextView>(R.id.streamTitle)
        val streamImage = findViewById<ImageView>(R.id.streamImage)

        // Set the title and image based on the stream selected
        streamTitle.text = "You selected $streamName Stream in B.Tech"
        streamImage.setImageResource(imageResId)
    }
}