package model;

import java.util.*;

public class Review {
    private String comment;
    private int rating;

    public double isPositive() {
        return rating >= 4;
    }

}
