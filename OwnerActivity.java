package com.example.homebuyapp; // Change to your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homebuyapp.LoginActivity;

public class OwnerActivity extends AppCompatActivity {

    TextView welcomeTextView;
       Button viewPropertiesButton;
    Button checkPaymentsButton;
    Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner); // Make sure you create this layout

        // Initialize views
        welcomeTextView = findViewById(R.id.welcomeTextView);
        viewPropertiesButton = findViewById(R.id.viewPropertiesButton);
        checkPaymentsButton = findViewById(R.id.checkPaymentsButton);
        logoutButton = findViewById(R.id.logoutButton);

        // Set a welcome message (optionally, you can get the owner's name from login)
        welcomeTextView.setText("Welcome, Owner!");

        // Set button click listeners
//        viewPropertiesButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Handle viewing properties
//                Intent intent = new Intent(OwnerActivity.this, ViewPropertiesActivity.class);
//                startActivity(intent);
//            }
//        });

//        checkPaymentsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Handle checking payments
//                Intent intent = new Intent(OwnerActivity.this, CheckPaymentsActivity.class);
//                startActivity(intent);
//            }
//        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout (clear user session, go back to login)
                finish(); // Finish this activity
                Intent intent = new Intent(OwnerActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
