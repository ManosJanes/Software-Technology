package model;

public class Review {
    private String rating;
    private String status;
    private String userId;
    private String text;

    public Review(String rating, String status, String userId, String text) {
        this.rating = rating;
        this.status = status;
        this.userId = userId;
        this.text = text;
    }
}
