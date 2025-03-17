package com.example.animereviewapi.controller;

import com.example.animereviewapi.model.Anime;
import com.example.animereviewapi.model.User;
import com.example.animereviewapi.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AnimeUserController {

    private final ReviewService reviewService;

    public AnimeUserController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    // Отримати всі аніме
    @GetMapping("/anime")
    public List<Anime> getAllAnime() {
        return reviewService.getAllAnime();
    }

    // Отримати всіх користувачів
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return reviewService.getAllUsers();
    }
}
