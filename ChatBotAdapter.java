package com.example.homebuyapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ChatBotAdapter extends RecyclerView.Adapter<ChatBotAdapter.ChatBotViewHolder> {

    private List<ChatBotMessage> chatBotMessages;

    public ChatBotAdapter(List<ChatBotMessage> chatBotMessages) {
        this.chatBotMessages = chatBotMessages;
    }

    @NonNull
    @Override
    public ChatBotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chatbot_item, parent, false);
        return new ChatBotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatBotViewHolder holder, int position) {
        ChatBotMessage chatBotMessage = chatBotMessages.get(position);
        holder.bind(chatBotMessage);
    }

    @Override
    public int getItemCount() {
        return chatBotMessages.size();
    }

    public static class ChatBotViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewMessage;

        public ChatBotViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewMessage = itemView.findViewById(R.id.textViewMessage);
        }

        public void bind(ChatBotMessage chatBotMessage) {
            textViewMessage.setText(chatBotMessage.getMessage());
            textViewMessage.setTextAlignment(chatBotMessage.isUser() ? View.TEXT_ALIGNMENT_TEXT_END : View.TEXT_ALIGNMENT_TEXT_START);
        }
    }
}
