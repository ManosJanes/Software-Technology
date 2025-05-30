package model;

public class Customer extends User {
    public Customer(String id, String name, String address, String phone, String email) {
        super(id, name, address, phone, email);
    }

    public void createBooking() {
        System.out.println("Booking created by customer: " + this.name);
    }
}
