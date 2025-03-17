package controller;

import model.Review;
import service.ReviewService;

import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController() {
        this.reviewService = new ReviewService();
    }

    //Додати рецензію
    @PostMapping
    public Review addReview(@RequestBody @Valid Review review) {
        return reviewService.addReview(review);
    }

    // Отримати усі рецензії
    @GetMapping
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    // Отримати усі рецензії аніме по ID
    @GetMapping("/anime/{animeId}")
    public List<Review> getReviewsByAnimeId(@PathVariable String animeId) {
        return reviewService.getReviewsByAnimeId(animeId);
    }

    // Отримати рецензію по ID
    @GetMapping("/{reviewId}")
    public Review getReviewById(@PathVariable String reviewId) {
        return reviewService.getReviewById(reviewId).orElse(null);
    }

    // Видалити рецензію по ID
    @DeleteMapping("/{reviewId}")
    public String deleteReview(@PathVariable String reviewId) {
        boolean deleted = reviewService.deleteReview(reviewId);
        return deleted ? "Review deleted successfully" : "Review not found";
    }

}
