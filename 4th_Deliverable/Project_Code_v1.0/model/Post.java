package model;

public class Post {
    private String authorId;
    private String title;
    private String content;

    public Post(String authorId, String title, String content) {
        this.authorId = authorId;
        this.title = title;
        this.content = content;
    }
}
