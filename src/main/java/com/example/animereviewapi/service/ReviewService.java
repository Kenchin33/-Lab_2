package com.example.animereviewapi.service;

import com.example.animereviewapi.model.Review;
import com.example.animereviewapi.model.Anime;
import com.example.animereviewapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReviewService {
    private List<Review> reviews = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<Anime> animes = new ArrayList<>();

    // Отримати всі аніме
    public List<Anime> getAllAnime() {
        return animes;
    }

    // Отримати всіх користувачів
    public List<User> getAllUsers() {
        return users;
    }

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


    public ReviewService() {
        animes.add(new Anime("1", "Naruto", "Action"));
        animes.add(new Anime("2", "One Piece", "Adventure"));
        animes.add(new Anime("3", "86", "Action"));
        animes.add(new Anime("4", "Attack on Titan", "Action"));
        animes.add(new Anime("5", "My Hero Academia", "Superhero"));
        animes.add(new Anime("6", "Death Note", "Thriller"));
        animes.add(new Anime("7", "One Punch Man", "Comedy"));
        animes.add(new Anime("8", "Sword Art Online", "Sci-fi"));
        animes.add(new Anime("9", "Your Lie in April", "Drama"));
        animes.add(new Anime("10", "Blue Box", "Romance"));

        users.add(new User("1", "Kenchin"));
        users.add(new User("2", "Ipoha13"));
        users.add(new User("3", "FisherMan"));
        users.add(new User("4", "Tomura"));
        users.add(new User("5", "Abdula"));
        users.add(new User("6", "DramQueen"));
        users.add(new User("7", "L"));
        users.add(new User("8", "Kirito01"));
        users.add(new User("9", "Sasuke_Back_In_Konoha"));
        users.add(new User("10", "-------"));
    }
}
