package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {

    private EditText nameEditText;
    private EditText genderEditText;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        nameEditText = findViewById(R.id.name_edit_text);
        genderEditText = findViewById(R.id.gender_edit_text);
        signUpButton = findViewById(R.id.sign_up_button);

        signUpButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            String gender = genderEditText.getText().toString();

            Intent intent = new Intent(signup.this, WelcomeActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("gender", gender);

            Log.d("SignUpActivity", "Navigating to WelcomeActivity with Name: " + name + ", Gender: " + gender);

            startActivity(intent);
            Toast.makeText(this, "Navigating to Welcome Activity", Toast.LENGTH_SHORT).show();
        });
    }
}