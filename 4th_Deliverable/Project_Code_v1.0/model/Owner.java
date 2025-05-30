package model;

public class Owner extends User {
    private String storeId;

    public Owner(String id, String name, String address, String phone, String email, String storeId) {
        super(id, name, address, phone, email);
        this.storeId = storeId;
    }

    public String getStoreId() {
        return storeId;
    }
}
