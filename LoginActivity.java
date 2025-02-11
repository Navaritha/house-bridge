//package com.example.homebuyapp;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class LoginActivity extends AppCompatActivity {
//
//    private EditText usernameEditText;
//    private EditText passwordEditText;
//    private Button loginButton;
//    private DatabaseHelper databaseHelper;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        usernameEditText = findViewById(R.id.username);
//        passwordEditText = findViewById(R.id.password);
//        loginButton = findViewById(R.id.login_button);
//        View buttonRegister = findViewById(R.id.register_link);
//        // Initialize the database helper
//        databaseHelper = new DatabaseHelper(this);
//
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                login();
//            }
//        });
//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    private void login() {
//        String username = usernameEditText.getText().toString();
//        String password = passwordEditText.getText().toString();
//
//        // Validate credentials
//        String role = databaseHelper.validateUser(username, password);
//
//        if (role != null) {
//            // Navigate based on role
//            if (role.equals("owner")) {
//                Intent intent = new Intent(this, OwnerActivity.class);
//                startActivity(intent);
//            } else if (role.equals("customer")) {
//                Intent intent = new Intent(this, CustomerActivity.class);
//                startActivity(intent);
//            }
//        } else {
//            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
//        }
//    }
//}
package com.example.homebuyapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.login_button);
        View buttonRegister = findViewById(R.id.register_link);

        // Initialize the database helper
        databaseHelper = new DatabaseHelper(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

//    private void login() {
//        String username = usernameEditText.getText().toString();
//        String password = passwordEditText.getText().toString();
//
//        // Validate credentials
//        String role = databaseHelper.validateUser(username, password);
//
//        if (role != null) {
//            // Navigate based on role
//            if (role.equals("owner")) {
//                Intent intent = new Intent(this, OwnerActivity.class);
//                startActivity(intent);
//            } else if (role.equals("customer")) {
//                Intent intent = new Intent(this, CustomerActivity.class);
//                startActivity(intent);
//            }
//            finish(); // Optional: Finish the login activity so it can't be accessed again with back button
//        } else {
//            Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
//        }
//    }
private void login() {
    String username = usernameEditText.getText().toString().trim();
    String password = passwordEditText.getText().toString().trim();

    // Log the input values
    Log.d("LoginActivity", "Username: " + username + ", Password: " + password);

    // Validate credentials
    String role = databaseHelper.validateUser(username, password);

    if (role != null) {
        // Navigate based on role
        if (role.equals("owner")) {
            Intent intent = new Intent(this, OwnerActivity.class);
            startActivity(intent);
        } else if (role.equals("customer")) {
            Intent intent = new Intent(this, CustomerActivity.class);
            startActivity(intent);
        }
        finish(); // Optional: Finish the login activity so it can't be accessed again with back button
    } else {
        Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show();
    }
}

}
