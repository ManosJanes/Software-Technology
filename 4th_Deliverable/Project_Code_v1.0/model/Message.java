package model;

import java.util.*;

public class Message {
    private String sender;
    private String content;

    public double checkMessageDetails() {
        return content != null && !content.isEmpty();
    }

}
