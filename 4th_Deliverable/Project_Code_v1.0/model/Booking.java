package model;

import java.util.*;

public class Booking {
    private String bookingId;
    private Store bookStore;
    private Date date;
    private String status;

    public Booking(String bookingId, Store store, Date date, String status) {
        this.bookingId = bookingId;
        this.bookStore = store;
        this.date = date;
        this.status = status;
    }
}
