package com.example.homebuyapp;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class ChatBotActivity2 extends AppCompatActivity {

    private WebView webViewChatBot2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot2);

        webViewChatBot2 = findViewById(R.id.webViewChatBot2);

        // Configure WebView settings
        WebSettings webSettings = webViewChatBot2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true); // Enable DOM storage if needed
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        // Set WebView client to handle page loading within the WebView
        webViewChatBot2.setWebViewClient(new WebViewClient());
        webViewChatBot2.setWebChromeClient(new WebChromeClient()); // Enables JavaScript dialogs, alerts, etc.

        // Load the Chatbase iframe URL
        webViewChatBot2.loadUrl("https://www.chatbase.co/chatbot-iframe/0LMdZi1bG7qB_V5l6eeMC");
    }

}
