package com.example.homebuyapp; // Change to your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homebuyapp.LoginActivity;

public class CustomerActivity extends AppCompatActivity {

    private TextView welcomeTextView;
    private Button viewAvailableHomesButton;
    private Button checkBookingsButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer); // Make sure you create this layout

        // Initialize views
        welcomeTextView = findViewById(R.id.welcomeTextView);
        viewAvailableHomesButton = findViewById(R.id.viewAvailableHomesButton);
        checkBookingsButton = findViewById(R.id.checkBookingsButton);
        logoutButton = findViewById(R.id.logoutButton);

        // Set a welcome message (optionally, you can get the customer's name from login)
        welcomeTextView.setText("Welcome, Customer!");

        // Set button click listeners
        viewAvailableHomesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle viewing available homes
                Intent intent = new Intent(CustomerActivity.this, AvailableHomesActivity.class);
                startActivity(intent);
            }
        });

//        checkBookingsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Handle checking bookings
//                Intent intent = new Intent(CustomerActivity.this, CheckBookingsActivity.class);
//                startActivity(intent);
//            }
//        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout (clear user session, go back to login)
                finish(); // Finish this activity
                Intent intent = new Intent(CustomerActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
