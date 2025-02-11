//package com.example.homebuyapp;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ChatActivity extends AppCompatActivity {
//
//    private EditText chatEditText;
//    private Button sendButton;
//    private ListView chatListView;
//    private ChatMessageAdapter adapter;
//    private List<ChatMessage> chatMessages;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_chat);
//
//        chatEditText = findViewById(R.id.chat_edit_text);
//        sendButton = findViewById(R.id.send_button);
//        chatListView = findViewById(R.id.chat_list_view);
//
//        chatMessages = new ArrayList<>();
//        adapter = new ChatMessageAdapter(this, chatMessages);
//        chatListView.setAdapter(adapter);
//
//        sendButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String message = chatEditText.getText().toString().trim();
//                if (!message.isEmpty()) {
//                    // Add message to list and update view
//                    chatMessages.add(new ChatMessage("You", message, "timestamp"));
//                    adapter.notifyDataSetChanged();
//                    chatEditText.setText(""); // Clear input field
//                    chatListView.setSelection(adapter.getCount() - 1);
//                } else {
//                    Toast.makeText(ChatActivity.this, "Please enter a message", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//    }
//}
package com.example.homebuyapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private EditText chatEditText;
    private Button sendButton;
    private ListView chatListView;
    private ChatMessageAdapter adapter;
    private List<ChatMessage> chatMessages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        chatEditText = findViewById(R.id.chat_edit_text);
        sendButton = findViewById(R.id.send_button);
        chatListView = findViewById(R.id.chat_list_view);

        // Initialize chat message list
        chatMessages = new ArrayList<>();
        loadPreChatMessages(); // Load pre-chat messages

        // Set up adapter and bind to ListView
        adapter = new ChatMessageAdapter(this, chatMessages);
        chatListView.setAdapter(adapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = chatEditText.getText().toString().trim();
                if (!message.isEmpty()) {
                    // Add message to list and update view
                    chatMessages.add(new ChatMessage("You", message, "Just now"));
                    adapter.notifyDataSetChanged();
                    chatEditText.setText(""); // Clear input field
                    chatListView.setSelection(adapter.getCount() - 1);
                } else {
                    Toast.makeText(ChatActivity.this, "Please enter a message", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void loadPreChatMessages() {
        // Add some sample pre-chat messages
        chatMessages.add(new ChatMessage("Alice", "Hello! How can I help you?", "10:00 AM"));
        chatMessages.add(new ChatMessage("You", "I wanted to know about the availability of houses.", "10:02 AM"));
        chatMessages.add(new ChatMessage("Alice", "Sure, we have multiple options available.", "10:05 AM"));
    }
}
