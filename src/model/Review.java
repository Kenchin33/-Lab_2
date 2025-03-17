package model;

public class Review {
    private String id;
    private String animeId;
    private String userId;
    private String content;
    private double rating;

    public Review(String id, String animeId, String userId, String content, double rating) {
        this.id = id;
        this.animeId = animeId;
        this.userId = userId;
        this.content = content;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnimeId() {
        return animeId;
    }

    public void setAnimeId(String animeId) {
        this.animeId = animeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
