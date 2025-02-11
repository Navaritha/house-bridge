////package com.example.homebuyapp;
////
////import androidx.appcompat.app.AppCompatActivity;
////import androidx.core.app.ActivityOptionsCompat;
////import androidx.core.view.ViewCompat;
////
////import android.content.Intent;
////import android.media.Image;
////import android.net.Uri;
////import android.os.Bundle;
////import android.view.View;
////import android.widget.ImageView;
////
////import com.google.android.material.button.MaterialButton;
////
////import java.util.Objects;
////
////public class MainActivity2 extends AppCompatActivity {
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main2);
////
////        ImageView back=findViewById(R.id.back);
////        ImageView lock;
////
////        lock = findViewById(R.id.lock);
////        MaterialButton button;
////
//////        button = findViewById(R.id.book);
//////        button.setOnClickListener(new View.OnClickListener() {
//////            @Override
//////            public void onClick(View view) {
//////                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
//////                startActivity(intent);
//////
//////            }
//////        });
////        lock.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                String mapUrl = "https://maps.app.goo.gl/rwnKoKQxSBaR8QEB6";
////
////                // Create an intent to open the URL
////                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
////
////                // Start the activity using the intent
////                startActivity(intent);
////            }
////        });
////        back.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                onBackPressed();
////            }
////        });
////    }
////}
////package com.example.homebuyapp;
////
////import androidx.appcompat.app.AppCompatActivity;
////import android.app.Dialog;
////import android.content.Intent;
////import android.net.Uri;
////import android.os.Bundle;
////import android.view.View;
////import android.widget.ImageView;
////import com.google.android.material.button.MaterialButton;
////
////public class MainActivity2 extends AppCompatActivity {
////
////   ImageView bedroomImageView, bathroomImageView;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main2);
////
////        ImageView back = findViewById(R.id.back);
////        ImageView lock = findViewById(R.id.lock);
////
////        // Find the ImageView for bedroom and bathroom
////        bedroomImageView = findViewById(R.id.bedroom);  // Update with the correct ID from your layout
////        bathroomImageView = findViewById(R.id.bathroom);  // Update with the correct ID from your layout
////
////        // Click listener for bedroom image
////        bedroomImageView.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                showImageDialog(R.drawable.bedroom_full);  // Replace with your full-size bedroom image
////            }
////        });
////
////        // Click listener for bathroom image
////        bathroomImageView.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                showImageDialog(R.drawable.bathroom_full);  // Replace with your full-size bathroom image
////            }
////        });
////
////        // Existing code to handle lock button click
////        lock.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                String mapUrl = "https://maps.app.goo.gl/rwnKoKQxSBaR8QEB6";
////                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
////                startActivity(intent);
////            }
////        });
////
////        // Existing code to handle back button click
////        back.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                onBackPressed();
////            }
////        });
////    }
////
////    // Method to display the image in a dialog
////    private void showImageDialog(int imageResId) {
////        Dialog dialog = new Dialog(this);
////        dialog.setContentView(R.layout.dialog_image);  // Use a separate layout for the image dialog
////        ImageView imageView = dialog.findViewById(R.id.dialogImageView);
////        imageView.setImageResource(imageResId);
////        dialog.show();
////    }
////}
////package com.example.homebuyapp;
////
////import androidx.appcompat.app.AppCompatActivity;
////import android.app.Dialog;
////import android.content.Intent;
////import android.net.Uri;
////import android.os.Bundle;
////import android.view.View;
////import android.widget.Button;
////import android.widget.EditText;
////import android.widget.ImageView;
////import android.widget.Toast;
////import com.google.android.material.button.MaterialButton;
////
////public class MainActivity2 extends AppCompatActivity {
////
////     MaterialButton bookNowButton;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main2);
////
////        ImageView back = findViewById(R.id.back);
////        ImageView lock = findViewById(R.id.lock);
////
////        // Initialize the Book Now button
////        bookNowButton = findViewById(R.id.bookNowButton);  // Ensure this matches your XML ID
////
////        bookNowButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                showOwnerInfoDialog();
////            }
////        });
////
////        // Existing lock button and back button code
////        lock.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                String mapUrl = "https://maps.app.goo.gl/rwnKoKQxSBaR8QEB6";
////                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
////                startActivity(intent);
////            }
////        });
////        back.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                onBackPressed();
////            }
////        });
////    }
////
////    // Method to display the dialog with owner information and user input fields
////    private void showOwnerInfoDialog() {
////        final Dialog dialog = new Dialog(this);
////        dialog.setContentView(R.layout.dialog_owner_info);  // Using the custom layout
////
////        // Find views in the dialog
////        EditText userName = dialog.findViewById(R.id.userName);
////        EditText userContact = dialog.findViewById(R.id.userContact);
////        Button submitButton = dialog.findViewById(R.id.submitButton);
////
////        // Set an onClickListener for the Submit button
////        submitButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                // Retrieve user input
////                String name = userName.getText().toString();
////                String contact = userContact.getText().toString();
////
////                if (!name.isEmpty() && !contact.isEmpty()) {
////                    Toast.makeText(MainActivity2.this, "Submitted", Toast.LENGTH_SHORT).show();
////                    dialog.dismiss();  // Close the dialog after submission
////                } else {
////                    Toast.makeText(MainActivity2.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
////                }
////            }
////        });
////
////        dialog.show();  // Show the dialog
////    }
////}
////package com.example.homebuyapp;
////
////import androidx.appcompat.app.AppCompatActivity;
////import android.app.Dialog;
////import android.content.Intent;
////import android.net.Uri;
////import android.os.Bundle;
////import android.view.View;
////import android.widget.Button;
////import android.widget.EditText;
////import android.widget.ImageView;
////import android.widget.Toast;
////import com.google.android.material.button.MaterialButton;
////
////public class MainActivity2 extends AppCompatActivity {
////
////    MaterialButton bookNowButton;
////    ImageView viewRestaurants;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_main2);
////
////        ImageView back = findViewById(R.id.back);
////        ImageView lock = findViewById(R.id.lock);
////        viewRestaurants = findViewById(R.id.park);
////
////        // Initialize the Book Now button
////        bookNowButton = findViewById(R.id.bookNowButton);
////
////        bookNowButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                showOwnerInfoDialog();
////            }
////        });
////
////        // View Nearby Restaurants button action
//////        viewRestaurants.setOnClickListener(new View.OnClickListener() {
//////            @Override
//////            public void onClick(View view) {
//////                String mapUrl = "https://maps.app.goo.gl/embedLinkHere";  // Replace with your embed link
//////
//////                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
//////                startActivity(intent);
//////            }
//////        });
////
////        // Lock button and Back button code
////        lock.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                String mapUrl = "https://maps.app.goo.gl/rwnKoKQxSBaR8QEB6";
////                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
////                startActivity(intent);
////            }
////
////        });
////        viewRestaurants.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                String mapUrl = "https://www.google.com/maps/search/restaurants+near+sns college of engineering +Coimbatore,+Tamil+Nadu";  // Update with your location
////
////                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
////                startActivity(intent);
////            }
////        });
////
////        back.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                onBackPressed();
////            }
////        });
////    }
////
////    // Method to display the dialog with owner information and user input fields
////    private void showOwnerInfoDialog() {
////        final Dialog dialog = new Dialog(this);
////        dialog.setContentView(R.layout.dialog_owner_info);
////
////        // Find views in the dialog
////        EditText userName = dialog.findViewById(R.id.userName);
////        EditText userContact = dialog.findViewById(R.id.userContact);
////        Button submitButton = dialog.findViewById(R.id.submitButton);
////
////        submitButton.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                String name = userName.getText().toString();
////                String contact = userContact.getText().toString();
////
////                if (!name.isEmpty() && !contact.isEmpty()) {
////                    Toast.makeText(MainActivity2.this, "Submitted", Toast.LENGTH_SHORT).show();
////                    dialog.dismiss();
////                } else {
////                    Toast.makeText(MainActivity2.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
////                }
////            }
////        });
////
////        dialog.show();
////    }
////}
//package com.example.homebuyapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.app.Dialog;
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ImageView;
//import android.widget.Toast;
//import com.google.android.material.button.MaterialButton;
//
//public class MainActivity2 extends AppCompatActivity {
//
//    MaterialButton bookNowButton;
//    ImageView viewRestaurants, bedroomImage, bathroomImage;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//        ImageView back = findViewById(R.id.back);
//        ImageView lock = findViewById(R.id.lock);
//        viewRestaurants = findViewById(R.id.park);
//
//        // Initialize images for bedroom and bathroom
//        bedroomImage = findViewById(R.id.bedroom);
//        bathroomImage = findViewById(R.id.bathroom);
//
//        // Initialize the Book Now button
//        bookNowButton = findViewById(R.id.bookNowButton);
//
//        bookNowButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showOwnerInfoDialog();
//            }
//        });
//
//        // Nearby Restaurants action
//        viewRestaurants.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String mapUrl = "https://www.google.com/maps/search/restaurants+near+sns+college+of+engineering+Coimbatore,+Tamil+Nadu";
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
//                startActivity(intent);
//            }
//        });
//
//        // Bedroom image click to show bedroom dialog
//        bedroomImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showBedroomDialog();
//            }
//        });
//
//        // Bathroom image click to show bathroom dialog
//        bathroomImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showBathroomDialog();
//            }
//        });
//
//        // Lock button action
//        lock.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String mapUrl = "https://maps.app.goo.gl/rwnKoKQxSBaR8QEB6";
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
//                startActivity(intent);
//            }
//        });
//
//        // Back button action
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onBackPressed();
//            }
//        });
//    }
//
//    // Method to display the dialog with owner information and user input fields
//    private void showOwnerInfoDialog() {
//        final Dialog dialog = new Dialog(this);
//        dialog.setContentView(R.layout.dialog_owner_info);
//
//        EditText userName = dialog.findViewById(R.id.userName);
//        EditText userContact = dialog.findViewById(R.id.userContact);
//        Button submitButton = dialog.findViewById(R.id.submitButton);
//
//        submitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = userName.getText().toString();
//                String contact = userContact.getText().toString();
//
//                if (!name.isEmpty() && !contact.isEmpty()) {
//                    Toast.makeText(MainActivity2.this, "Submitted", Toast.LENGTH_SHORT).show();
//                    dialog.dismiss();
//                } else {
//                    Toast.makeText(MainActivity2.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        dialog.show();
//    }
//
//    // Method to display the bedroom dialog
//    private void showBedroomDialog() {
//        final Dialog bedroomDialog = new Dialog(this);
//        bedroomDialog.setContentView(R.layout.dialog_bedroom_info);  // Use a custom layout for bedroom dialog
//
//        // Configure elements inside bedroom dialog if needed
//        Button closeButton = bedroomDialog.findViewById(R.id.closeBedroomDialog);
//        closeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bedroomDialog.dismiss();
//            }
//        });
//
//        bedroomDialog.show();
//    }
//
//    // Method to display the bathroom dialog
//    private void showBathroomDialog() {
//        final Dialog bathroomDialog = new Dialog(this);
//        bathroomDialog.setContentView(R.layout.dialog_bathroom_info);  // Use a custom layout for bathroom dialog
//
//        // Configure elements inside bathroom dialog if needed
//        Button closeButton = bathroomDialog.findViewById(R.id.closeBathroomDialog);
//        closeButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                bathroomDialog.dismiss();
//            }
//        });
//
//        bathroomDialog.show();
//    }
//}
//
//
//package com.example.homebuyapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//import android.app.Dialog;
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//import com.google.android.material.button.MaterialButton;
//
//public class MainActivity2 extends AppCompatActivity {
//
//     ImageView bedroomImageView, bathroomImageView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//
//        ImageView back = findViewById(R.id.back);
//        ImageView lock = findViewById(R.id.lock);
//
//        // Find the ImageView for bedroom and bathroom
//        bedroomImageView = findViewById(R.id.bedroom);  // Update with the correct ID from your layout
//        bathroomImageView = findViewById(R.id.bathroom);  // Update with the correct ID from your layout
//
//        // Click listener for bedroom image
//        bedroomImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showImageDialog(R.drawable.bedroom_full);  // Replace with your full-size bedroom image
//            }
//        });
//
//        // Click listener for bathroom image
//        bathroomImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showImageDialog(R.drawable.bathroom_full);  // Replace with your full-size bathroom image
//            }
//        });
//
//        // Existing code to handle lock button click
//        lock.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String mapUrl = "https://maps.app.goo.gl/rwnKoKQxSBaR8QEB6";
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
//                startActivity(intent);
//            }
//        });
//
//        // Existing code to handle back button click
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onBackPressed();
//            }
//        });
//    }
//
//    // Method to display the image in a dialog
//    private void showImageDialog(int imageResId) {
//        Dialog dialog = new Dialog(this);
//        dialog.setContentView(R.layout.dialog_image);  // Use a separate layout for the image dialog
//        ImageView imageView = dialog.findViewById(R.id.dialogImageView);
//        imageView.setImageResource(imageResId);
//        dialog.show();
//    }
//}
package com.example.homebuyapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    ImageView bedroomImageView, bathroomImageView, viewServices; // Renamed to reflect new functionality
    MaterialButton bookNowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView back = findViewById(R.id.back);
        ImageView lock = findViewById(R.id.lock);
        viewServices = findViewById(R.id.parkk); // Updated to the ImageView ID for services
        bookNowButton = findViewById(R.id.bookNowButton); // Ensure this ID matches your layout

        // Find the ImageView for bedroom and bathroom
        bedroomImageView = findViewById(R.id.bedroom);  // Update with the correct ID from your layout
        bathroomImageView = findViewById(R.id.bathroom);  // Update with the correct ID from your layout

        // Click listener for bedroom image
        bedroomImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showImageDialog(R.drawable.bedroom_full);  // Replace with your full-size bedroom image
            }
        });

        // Click listener for bathroom image
        bathroomImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showImageDialog(R.drawable.bathroom_full);  // Replace with your full-size bathroom image
            }
        });
        ImageView viewRestaurants = findViewById(R.id.park);
        viewRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mapUrl = "https://www.google.com/maps/search/restaurants+near+sns+college+of+engineering+Coimbatore,+Tamil+Nadu";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
                startActivity(intent);
            }
        });

        // Click listener for nearby services
        viewServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showServicesDialog(); // Show the services dialog
            }
        });

        // Click listener for Book Now button
        bookNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showOwnerInfoDialog();
            }
        });

        // Lock button click listener
        lock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mapUrl = "https://maps.app.goo.gl/1qxsAZnwEUdGCMdt9";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
                startActivity(intent);
            }
        });

        // Back button click listener
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    // Method to display the image in a dialog
    private void showImageDialog(int imageResId) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_image);  // Use a separate layout for the image dialog
        ImageView imageView = dialog.findViewById(R.id.dialogImageView);
        imageView.setImageResource(imageResId);
        dialog.show();
    }

    // Method to display the dialog with nearby services
    private void showServicesDialog() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_services); // Set the dialog layout

        // Set dialog width and height
        dialog.getWindow().setLayout((int)(getResources().getDisplayMetrics().widthPixels * 0.9), // 90% of the screen width
                (int)(getResources().getDisplayMetrics().heightPixels * 0.7)); // 70% of the screen height

        ListView servicesListView = dialog.findViewById(R.id.servicesListView);
        Button closeButton = dialog.findViewById(R.id.closeButton);

        // Sample service data
        String[] services = {
                "Plumber - 1234567890",
                "Electrician - 0987654321",
                "Milk Man - 1122334455",
                "Mobile Puncture - 2233445566"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, services);
        servicesListView.setAdapter(adapter); // Set the adapter to the ListView

        // Close button click listener
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss(); // Close the dialog
            }
        });

        dialog.show(); // Show the dialog
    }

    // Method to display the dialog with owner information and user input fields
    private void showOwnerInfoDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_owner_info);  // Using the custom layout

        // Find views in the dialog
        EditText userName = dialog.findViewById(R.id.userName);
        EditText userContact = dialog.findViewById(R.id.userContact);
        Button submitButton = dialog.findViewById(R.id.submitButton);

        // Set an onClickListener for the Submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve user input
                String name = userName.getText().toString();
                String contact = userContact.getText().toString();

                if (!name.isEmpty() && !contact.isEmpty()) {
                    Toast.makeText(MainActivity2.this, "Submitted", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();  // Close the dialog after submission
                } else {
                    Toast.makeText(MainActivity2.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });

        dialog.show();  // Show the dialog
    }
}

