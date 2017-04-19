package ru.kpfu.itis.kadyrov.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Table(name = "video")
public class Video {
    private int id;
    @Column
    private int game_id;
    @Column
    private String videoLink;
    @Column
    private String title;
    @Column
    private String date;

    public Video(int id, int game_id, String videoLink, String title, String date) {
        this.id = id;
        this.game_id = game_id;
        this.videoLink = videoLink;
        this.title = title;
        this.date = date;
    }

    public Video(int game_id, String videoLink, String title) {
        this.game_id = game_id;
        this.videoLink = videoLink;
        this.title = title;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public int getId() {
        return id;
    }

    public int getGame_id() {
        return game_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
