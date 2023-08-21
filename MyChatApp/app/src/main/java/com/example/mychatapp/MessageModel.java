package com.example.mychatapp;

public class MessageModel {
    private String msgID;
    private String senderId;
    private String message;

    public MessageModel(String msgID, String senderId, String message) {
        this.msgID = msgID;
        this.senderId = senderId;
        this.message = message;
    }

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageModel() {

    }
}
