package ru.kpfu.itis.kadyrov.models;

import javax.persistence.*;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String date;
    @Column
    private String description;
    @Column
    private String imageURL;
    @Column
    private float rating;

    public Game(int id, String name, String date, String description, String imageURL, float rating) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.description = description;
        this.imageURL = imageURL;
        this.rating = rating;
    }

    public Game(String name, String date, String description, String imageURL) {
        this.name = name;
        this.date = date;
        this.description = description;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

