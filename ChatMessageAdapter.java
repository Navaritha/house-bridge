package com.example.homebuyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ChatMessageAdapter extends BaseAdapter {

    private Context context;
    private List<ChatMessage> chatMessages;

    public ChatMessageAdapter(Context context, List<ChatMessage> chatMessages) {
        this.context = context;
        this.chatMessages = chatMessages;
    }

    @Override
    public int getCount() {
        return chatMessages.size();
    }

    @Override
    public Object getItem(int position) {
        return chatMessages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_chat_message, parent, false);
        }

        ChatMessage chatMessage = chatMessages.get(position);

        TextView senderTextView = convertView.findViewById(R.id.sender_name);
        TextView messageTextView = convertView.findViewById(R.id.message_text);
        TextView timestampTextView = convertView.findViewById(R.id.timestamp);

        senderTextView.setText(chatMessage.getSenderName());
        messageTextView.setText(chatMessage.getMessage());
        timestampTextView.setText(chatMessage.getTimestamp());

        return convertView;
    }
}
