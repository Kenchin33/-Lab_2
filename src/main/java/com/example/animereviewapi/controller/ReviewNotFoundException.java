package com.example.animereviewapi.controller;

public class ReviewNotFoundException extends RuntimeException {
    
    public ReviewNotFoundException(String message) {
        super(message);
    }
}
