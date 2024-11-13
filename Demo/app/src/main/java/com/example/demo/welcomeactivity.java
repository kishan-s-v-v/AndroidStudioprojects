package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class welcomeactivity extends Activity {
    private TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomeactivity);

        welcomeTextView = findViewById(R.id.welcome_text_view);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String gender = intent.getStringExtra("gender");

        welcomeTextView.setText("Welcome, " + name + " (" + gender + ")!");

        Toast.makeText(this, "Data received successfully!", Toast.LENGTH_SHORT).show();

        Log.d("WelcomeActivity", "Name: " + name + ", Gender: " + gender);
    }
}