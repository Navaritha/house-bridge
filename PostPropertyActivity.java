package com.example.homebuyapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PostPropertyActivity extends AppCompatActivity {

    private static final int PICK_IMAGE_REQUEST = 1;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_property);

        EditText editTextRent = findViewById(R.id.editTextRent);
        EditText editTextRentSplit = findViewById(R.id.editTextRentSplit);
        EditText editTextNumberOfPeople = findViewById(R.id.editTextNumberOfPeople);
        EditText editTextRegistrationNumber = findViewById(R.id.editTextRegistrationNumber);
        Button buttonUploadImage = findViewById(R.id.buttonUploadImage);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonUploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFileChooser();
            }
        });

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Here you can handle the submission of the property details
                String rent = editTextRent.getText().toString();
                String rentSplit = editTextRentSplit.getText().toString();
                String numberOfPeople = editTextNumberOfPeople.getText().toString();
                String registrationNumber = editTextRegistrationNumber.getText().toString();

                if (rent.isEmpty() || rentSplit.isEmpty() || numberOfPeople.isEmpty() || registrationNumber.isEmpty()) {
                    Toast.makeText(PostPropertyActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Handle the submission logic, such as saving to a database or sending to a server

                Toast.makeText(PostPropertyActivity.this, "Property Posted Successfully", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    private void openFileChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imageUri = data.getData();
            // You can display the selected image or handle it as needed
        }
    }
}
