package com.example.homebuyapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//package com.example.homebuyapp; // Change to your actual package name
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class RegisterActivity extends AppCompatActivity {
//
//    private EditText editTextUsername;
//    private EditText editTextPassword;
//    private Button buttonRegister;
//    private RadioGroup radioGroupAccountType;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//
//        editTextUsername = findViewById(R.id.editTextUsername);
//        editTextPassword = findViewById(R.id.editTextPassword);
//        buttonRegister = findViewById(R.id.buttonRegister);
//        radioGroupAccountType = findViewById(R.id.radioGroupAccountType);
//
//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                registerUser();
//            }
//        });
//    }
//
//    private void registerUser() {
//        String username = editTextUsername.getText().toString();
//        String password = editTextPassword.getText().toString();
//
//        // Determine which account type is selected
//        int selectedId = radioGroupAccountType.getCheckedRadioButtonId();
//        String accountType = "Customer"; // Default
//
//        if (selectedId == R.id.radioOwner) {
//            accountType = "Owner";
//        }
//
//        // Call a method to save the user details in the database
//        boolean isRegistered = saveUserToDatabase(username, password, accountType);
//
//        if (isRegistered) {
//            Toast.makeText(RegisterActivity.this, "Registration successful!", Toast.LENGTH_SHORT).show();
//            finish(); // Close the registration activity
//        } else {
//            Toast.makeText(RegisterActivity.this, "Registration failed. Please try again.", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private boolean saveUserToDatabase(String username, String password, String accountType) {
//        // Implement your database saving logic here
//        // You can add the accountType to your user table in the database
//        return true; // Return true if registration was successful, false otherwise
//    }
//}
public class RegisterActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;
    private EditText roleEditText; // For specifying role during registration
    private Button registerButton;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize the EditText fields and button
        usernameEditText = findViewById(R.id.editTextUsername);
        passwordEditText = findViewById(R.id.editTextPassword);
        roleEditText = findViewById(R.id.editTextRole); // Initialize the role EditText
        registerButton = findViewById(R.id.buttonRegister);

        // Initialize the database helper
        databaseHelper = new DatabaseHelper(this);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String role = roleEditText.getText().toString().trim(); // "owner" or "customer"

                // Validate role input
                if (!role.equals("owner") && !role.equals("customer")) {
                    Toast.makeText(RegisterActivity.this, "Please enter a valid role (owner/customer)", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Add user to the database
                databaseHelper.addUser(username, password, role);
                Toast.makeText(RegisterActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();

                // Optionally, navigate back to the login screen
                finish();
            }
        });
    }
}

