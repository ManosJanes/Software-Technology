package model;

import java.util.*;

public class Coupon {
    private String code;
    private double discount;

    public double validateCoupon() {
        return code != null && !code.isEmpty() && discount > 0;
    }

}
