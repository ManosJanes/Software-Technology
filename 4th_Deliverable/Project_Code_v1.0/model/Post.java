package model;

import java.util.*;

public class Post {
    private String title;
    private String body;

    public double validatePostDetails() {
        return title != null && body != null;
    }

}
