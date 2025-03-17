package com.example.animereviewapi.model;

public class Anime {
    private String id;
    private String name;
    private String genre;

    public Anime(String id, String name, String genre){
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
} 