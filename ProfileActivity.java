package com.example.homebuyapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView welcomeTextView;
   Button viewAvailableHomesButton;
    private Button checkBookingsButton;
    private Button logoutButton;

    // SharedPreferences for saving login status
    private SharedPreferences sharedPreferences;
    private static final String PREFS_NAME = "LoginPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        // Initialize views
     //   welcomeTextView = findViewById(R.id.welcomeTextView);
        viewAvailableHomesButton = findViewById(R.id.viewAvailableHomesButton);
        //checkBookingsButton = findViewById(R.id.checkBookingsButton);
     //   logoutButton = findViewById(R.id.logoutButton);

        // Set welcome message for the user
        welcomeTextView.setText("Welcome, Customer!");

        // Set click listener for the "View Available Homes" button
        viewAvailableHomesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, AvailableHomesActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for the "Check My Bookings" button
        checkBookingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // You can add code here to navigate to the bookings page (if implemented)
                // Intent intent = new Intent(ProfileActivity.this, BookingsActivity.class);
                // startActivity(intent);
            }
        });

        // Set click listener for the "Logout" button
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear saved login status from SharedPreferences
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                // Redirect to LoginActivity
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Check if the user is already logged in
        boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);
        if (!isLoggedIn) {
            // If not logged in, redirect to LoginActivity
            Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
