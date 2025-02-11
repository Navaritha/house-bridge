package com.example.homebuyapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homebuyapp.ChatBotAdapter;
import com.example.homebuyapp.ChatBotMessage;

import java.util.ArrayList;
import java.util.List;

public class ChatBotActivity extends AppCompatActivity {

    private RecyclerView recyclerViewChatBot;
    private ChatBotAdapter chatBotAdapter;
    private List<ChatBotMessage> chatBotMessages;
    private EditText editTextInput;
    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        recyclerViewChatBot = findViewById(R.id.recyclerViewChatBot);
        editTextInput = findViewById(R.id.editTextInput);
        buttonSend = findViewById(R.id.buttonSend);

        chatBotMessages = new ArrayList<>();
        chatBotAdapter = new ChatBotAdapter(chatBotMessages);
        recyclerViewChatBot.setAdapter(chatBotAdapter);
        recyclerViewChatBot.setLayoutManager(new LinearLayoutManager(this));

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editTextInput.getText().toString().trim();
                if (!userInput.isEmpty()) {
                    addChatBotMessage(userInput, true);
                    handleUserInput(userInput);
                    editTextInput.setText("");
                }
            }
        });
    }

    private void addChatBotMessage(String message, boolean isUser) {
        chatBotMessages.add(new ChatBotMessage(message, isUser));
        chatBotAdapter.notifyItemInserted(chatBotMessages.size() - 1);
        recyclerViewChatBot.scrollToPosition(chatBotMessages.size() - 1);
    }

    private void handleUserInput(String input) {
        String response;
        if (input.toLowerCase().contains("available homes")) {
            response = "Currently, we have 5 available homes in your area.";
        } else if (input.toLowerCase().contains("rental agreement")) {
            response = "A rental agreement is a contract between the landlord and tenant. Would you like more details?";
        } else if (input.toLowerCase().contains("rooms")) {
            response = "There are 3 shared rooms and 2 private rooms available.";
        } else {
            response = "I'm here to help with information on available homes, rooms, and rental agreements. Please ask a related question!";
        }

        addChatBotMessage(response, false);
    }
}
