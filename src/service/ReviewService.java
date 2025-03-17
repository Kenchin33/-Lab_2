package service;

import model.Review;
import model.Anime;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReviewService {
    private List<Review> reviews = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Anime> animes = new ArrayList<>();

    // Додавання рецензії
    public Review addReview(Review review) {
        reviews.add(review);
        return review;
    }

    // Отримати усі рецензії
    public List<Review> getAllReviews() {
        return reviews;
    }

    // Отримати рецензії аніме по ID
    public List<Review> getReviewsByAnimeId(String animeId) {
        List<Review> result = new ArrayList<>();
        for (Review review : reviews) {
            if(review.getAnimeId().equals(animeId)) {
                result.add(review);
            }
        }
        return result;
    }

    // Отримати рецензію по ID
    public Optional<Review> getReviewById(String reviewId) {
        return reviews.stream().filter(r -> r.getId().equals(reviewId)).findFirst();
    }

    // Видалити рецензію по ID
    public boolean deleteReview(String reviewId) {
        return reviews.removeIf(r -> r.getId().equals(reviewId));
    }
}
