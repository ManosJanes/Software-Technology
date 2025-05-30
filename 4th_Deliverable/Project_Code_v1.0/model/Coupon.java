package model;

public class Coupon {
    private String couponId;
    private String code;
    private float discount;
    private int quantity;

    public Coupon(String couponId, String code, float discount, int quantity) {
        this.couponId = couponId;
        this.code = code;
        this.discount = discount;
        this.quantity = quantity;
    }
}
