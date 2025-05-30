package model;

import java.util.*;

public class Statistics {
    private int bookings;
    private int reviews;

    public double calculateAverage() {
        return (bookings + reviews) / 2.0;
    }

}
