package com.example.homebuyapp;

public class ChatMessage {

    private String senderName;
    private String message;
    private String timestamp;

    public ChatMessage(String senderName, String message, String timestamp) {
        this.senderName = senderName;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
