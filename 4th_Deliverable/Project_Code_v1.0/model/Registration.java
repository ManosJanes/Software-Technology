package model;

import java.util.*;

public class Registration {
    private String username;
    private String email;

    public String checkBookingDetails() {
        return email.contains("@");
    }

}
