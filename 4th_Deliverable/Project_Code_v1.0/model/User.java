package model;

public class User {
    protected String id;
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public User() {}

    public User(String id, String name, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return name + " (" + email + ")";
    }
}
