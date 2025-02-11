//package com.example.homebuyapp;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityOptionsCompat;
//import androidx.core.view.GravityCompat;
//import androidx.core.view.ViewCompat;
//import androidx.drawerlayout.widget.DrawerLayout;
//
//import com.example.homebuyapp.R;
//
//import android.animation.AnimatorSet;
//import android.animation.ObjectAnimator;
//import android.content.Intent;
//import android.media.Image;
//import android.net.Uri;
//import android.os.Bundle;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.animation.AccelerateDecelerateInterpolator;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.view.animation.TranslateAnimation;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//import android.widget.Toast;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.navigation.NavigationBarView;
//import com.google.android.material.navigation.NavigationView;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ImageView img=findViewById(R.id.img);
//
//
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
//                ActivityOptionsCompat activityOptionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,img, ViewCompat.getTransitionName(img));
//                startActivity(intent,activityOptionsCompat.toBundle());
//            }
//        });
//        ImageView img1 = findViewById(R.id.img1);
//
//        // Set an onClickListener to open Activity3 when clicked
//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
//                startActivity(intent);
//            }
//        });
//        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
//        NavigationView navigationView = findViewById(R.id.navigation_view);
//        ImageView menuIcon = findViewById(R.id.menuIcon);
//
//        menuIcon.setOnClickListener(v -> {
//            drawerLayout.openDrawer(GravityCompat.START);
//        });
//        ImageView imgMessage = findViewById(R.id.imgMessage); // Update with the ID of your message button
//
//        imgMessage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
//                startActivity(intent);
//            }
//        });
//
////        navigationView.setNavigationItemSelectedListener(item -> {
////            // Handle navigation menu item clicks here
////            switch (item.getItemId()) {
////                case R.id.nav_post_property:
////                    // Handle action
////                    break;
////                case R.id.nav_packers_movers:
////                    // Handle action
////                    break;
////                // Add cases for other items
////            }
////            drawerLayout.closeDrawer(GravityCompat.START);
////            return true;
////        });
//
//       ImageView loginButton = findViewById(R.id.loginButton);
//
//        // Set click listener for the login button
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Start the LoginActivity when the button is clicked
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }
//}
//package com.example.homebuyapp;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityOptionsCompat;
//import androidx.core.view.GravityCompat;
//import androidx.core.view.ViewCompat;
//import androidx.drawerlayout.widget.DrawerLayout;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.MenuItem;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//
//import com.google.android.material.navigation.NavigationView;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        ImageView img = findViewById(R.id.img);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
//                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, img, ViewCompat.getTransitionName(img));
//                startActivity(intent, activityOptionsCompat.toBundle());
//            }
//        });
//
//        ImageView img1 = findViewById(R.id.img1);
//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
//                startActivity(intent);
//            }
//        });
//
//        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
//        NavigationView navigationView = findViewById(R.id.navigation_view);
//        ImageView menuIcon = findViewById(R.id.menuIcon);
//
//        menuIcon.setOnClickListener(v -> {
//            drawerLayout.openDrawer(GravityCompat.START);
//        });
//
//        ImageView imgMessage = findViewById(R.id.imgMessage);
//        imgMessage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ChatActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageView loginButton = findViewById(R.id.loginButton);
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        // Filter button functionality
//        Button filterButton = findViewById(R.id.filterButton);
//        filterButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Inflate the custom layout for the dialog
//                LayoutInflater inflater = getLayoutInflater();
//                View dialogView = inflater.inflate(R.layout.dialog_filter, null);
//
//                // Find buttons in the custom layout
//                Button buttonOption1 = dialogView.findViewById(R.id.button_option1);
//                Button buttonOption2 = dialogView.findViewById(R.id.button_option2);
//                Button buttonOption3 = dialogView.findViewById(R.id.button_option3);
//                Button buttonOption4 = dialogView.findViewById(R.id.button_option4);
//                Button postPropertyButton = findViewById(R.id.postPropertyButton);
//
//                postPropertyButton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Intent intent = new Intent(MainActivity.this, PostPropertyActivity.class);
//                        startActivity(intent);
//                    }
//                });
//
//
//                // Create the AlertDialog with the custom layout
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setTitle("Filter Options")
//                        .setView(dialogView)
//                        .setNegativeButton("Cancel", null)
//                        .show();
//
//                // Set click listeners for the buttons to navigate to other activities
////                buttonOption1.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        Intent intent = new Intent(MainActivity.this, Option1Activity.class);
////                        startActivity(intent);
////                    }
////                });
//
////                buttonOption2.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        Intent intent = new Intent(MainActivity.this, Option2Activity.class);
////                        startActivity(intent);
////                    }
////                });
//
////                buttonOption3.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        Intent intent = new Intent(MainActivity.this, Option3Activity.class);
////                        startActivity(intent);
////                    }
////                });
//
////                buttonOption4.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////                        Intent intent = new Intent(MainActivity.this, Option4Activity.class);
////                        startActivity(intent);
////                    }
////                });
//            }
//        });
//    }
//}
package com.example.homebuyapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        ImageView img = findViewById(R.id.img);
        img.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(intent);
        });
        ImageView imageViewChatBot2 = findViewById(R.id.imageViewChatBot2);
        imageViewChatBot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChatBotActivity2.class);
                startActivity(intent);
            }
        });

        ImageView img1 = findViewById(R.id.img1);
        img1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent);
        });

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);
        ImageView menuIcon = findViewById(R.id.menuIcon);

        menuIcon.setOnClickListener(v -> {
            drawerLayout.openDrawer(GravityCompat.START);
        });

        ImageView imgMessage = findViewById(R.id.imgMessage);
        imgMessage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChatActivity.class);
            startActivity(intent);
        });

        ImageView loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        // NavigationView item selection handling
        navigationView.setNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.postPropertyButton) {
                // Open PostPropertyActivity when "Post Your Property" is clicked
                Intent postIntent = new Intent(MainActivity.this, PostPropertyActivity.class);
                startActivity(postIntent);
            }

            // Close the drawer after handling the item click
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        });
     ImageView imageViewChatBot;
        imageViewChatBot = findViewById(R.id.imageViewChatBot);

        imageViewChatBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the ChatBotActivity when the ImageView is clicked
                Intent intent = new Intent(MainActivity.this, ChatBotActivity.class);
                startActivity(intent);
            }
        });
         SearchView searchView;
          ImageView searchBtn;
        searchView = findViewById(R.id.searchView);
        searchBtn = findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (searchView.getVisibility() == View.GONE) {
                    searchView.setVisibility(View.VISIBLE);
                } else {
                    searchView.setVisibility(View.GONE);
                }
            }
        });

        // New filter button functionality
        Button filterButton = findViewById(R.id.filterButton);
        filterButton.setOnClickListener(v -> showFilterDialog());
    }

    private void showFilterDialog() {
        // Inflate the custom layout for the dialog
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_filter, null);

        // Initialize buttons from the dialogView
        Button option1Button = dialogView.findViewById(R.id.button_option1);
        Button option2Button = dialogView.findViewById(R.id.button_option2);
        Button option3Button = dialogView.findViewById(R.id.button_option3);
        Button option4Button = dialogView.findViewById(R.id.button_option4);

        // Set button click listeners
        option1Button.setOnClickListener(view -> {
            // Handle Option 1
            // Add your logic here
        });

        option2Button.setOnClickListener(view -> {
            // Handle Option 2
            // Add your logic here
        });

        option3Button.setOnClickListener(view -> {
            // Handle Option 3
            // Add your logic here
        });

        option4Button.setOnClickListener(view -> {
            // Handle Option 4
            // Add your logic here
        });

        // Create and show the AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Filter Options")
                .setView(dialogView)
                .setNegativeButton("Cancel", null)
                .show();
    }
}
