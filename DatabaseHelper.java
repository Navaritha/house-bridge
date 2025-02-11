//package com.example.homebuyapp;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//public class DatabaseHelper extends SQLiteOpenHelper {
//
//    private static final String DATABASE_NAME = "YourDatabaseName.db";
//    private static final int DATABASE_VERSION = 1;
//
//    public static final String TABLE_USERS = "users";
//    public static final String COLUMN_ID = "id";
//    public static final String COLUMN_USERNAME = "username";
//    public static final String COLUMN_PASSWORD = "password";
//    public static final String COLUMN_ROLE = "role";
//
//    // Create table SQL query
//    private static final String TABLE_USERS_CREATE =
//            "CREATE TABLE " + TABLE_USERS + " (" +
//                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                    COLUMN_USERNAME + " TEXT UNIQUE, " +
//                    COLUMN_PASSWORD + " TEXT, " +
//                    COLUMN_ROLE + " TEXT);";
//
//    public DatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL(TABLE_USERS_CREATE);
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
//        onCreate(db);
//    }
//
//    // Method to add a user
//    public void addUser(String username, String password, String role) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(COLUMN_USERNAME, username);
//        values.put(COLUMN_PASSWORD, password);
//        values.put(COLUMN_ROLE, role);
//        db.insert(TABLE_USERS, null, values);
//        db.close();
//    }
//
//    // Method to validate user credentials
//    public String validateUser(String username, String password) {
//        SQLiteDatabase db = this.getReadableDatabase();
//        Cursor cursor = db.query(TABLE_USERS, new String[]{COLUMN_ROLE},
//                COLUMN_USERNAME + "=? AND " + COLUMN_PASSWORD + "=?",
//                new String[]{username, password}, null, null, null);
//        if (cursor != null && cursor.moveToFirst()) {
//            String role = cursor.getString(0);
//            cursor.close();
//            return role; // Return the user's role
//        }
//        return null; // Invalid credentials
//    }
//}
package com.example.homebuyapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "YourDatabaseName.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_USERS = "users";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_ROLE = "role";

    // Create table SQL query
    private static final String TABLE_USERS_CREATE =
            "CREATE TABLE " + TABLE_USERS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_USERNAME + " TEXT UNIQUE NOT NULL, " +
                    COLUMN_PASSWORD + " TEXT NOT NULL, " +
                    COLUMN_ROLE + " TEXT NOT NULL);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_USERS_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }

    // Method to add a user
    public void addUser(String username, String password, String role) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNAME, username);
        values.put(COLUMN_PASSWORD, password);
        values.put(COLUMN_ROLE, role);
        db.insert(TABLE_USERS, null, values);
        db.close();
    }


    public String validateUser(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_USERS, new String[]{COLUMN_ROLE},
                COLUMN_USERNAME + "=? AND " + COLUMN_PASSWORD + "=?",
                new String[]{username, password}, null, null, null);

        // Log the username and password being checked
        Log.d("DatabaseHelper", "Checking credentials for username: " + username + ", password: " + password);

        String role = null;
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                role = cursor.getString(0); // Get role
            }
            cursor.close();
        }
        // Log the result
        Log.d("DatabaseHelper", "Role found: " + role);

        return role; // Return the user's role or null if not found
    }

}

