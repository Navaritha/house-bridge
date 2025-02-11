package com.example.homebuyapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RentalAgreementActivity extends AppCompatActivity {

    private EditText tenantNameEditText, propertyDetailsEditText, rentalPeriodEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_agreement);

        // Initialize views
        tenantNameEditText = findViewById(R.id.tenantName);
        propertyDetailsEditText = findViewById(R.id.propertyDetails);
        rentalPeriodEditText = findViewById(R.id.rentalPeriod);
        submitButton = findViewById(R.id.submitButton);

        // Set the onClick listener for the Submit button
        submitButton.setOnClickListener(v -> {
            String tenantName = tenantNameEditText.getText().toString().trim();
            String propertyDetails = propertyDetailsEditText.getText().toString().trim();
            String rentalPeriod = rentalPeriodEditText.getText().toString().trim();

            // Validate input fields
            if (tenantName.isEmpty() || propertyDetails.isEmpty() || rentalPeriod.isEmpty()) {
                Toast.makeText(RentalAgreementActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Here you can handle form submission logic, e.g., saving the data to the database
                // For now, we will show a simple Toast as a confirmation.
                Toast.makeText(RentalAgreementActivity.this, "Rental Agreement Submitted!", Toast.LENGTH_SHORT).show();

                // You can also clear the form fields after submission
                tenantNameEditText.setText("");
                propertyDetailsEditText.setText("");
                rentalPeriodEditText.setText("");
            }
        });
    }
}
