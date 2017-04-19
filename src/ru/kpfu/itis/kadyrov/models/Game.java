package ru.kpfu.itis.kadyrov.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Entity
@Table(name = "game")
public class Game {
    private int id;
    private String name;
    private String date;
    private String description;
    private String imageURL;
    private float rating;
    @OneToMany(mappedBy = "news")
    private List<News> news;
    @OneToMany(mappedBy = "video")
    private List<Video> videos;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getDate() {
        return date;
    }

    public void setDate(String  date) {
        this.date = date;
    }

    @Column
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column
    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Column
    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}

