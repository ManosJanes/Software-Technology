package model;

public class Message {
    private String senderId;
    private String receiverId;
    private String text;

    public Message(String senderId, String receiverId, String text) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.text = text;
    }
}
