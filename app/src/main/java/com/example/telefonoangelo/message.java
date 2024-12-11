package com.example.telefonoangelo;

public class message {
    private String senderId;
    private String receiverId;
    private String messageContent;

    public message() {
        // Constructor vacío necesario para Firebase
    }

    public message(String senderId, String receiverId, String messageContent) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.messageContent = messageContent;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
}

