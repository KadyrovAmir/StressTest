package ru.kpfu.itis.kadyrov.models;

import javax.persistence.*;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Entity
@Table(name = "video")
public class Video {
    private int id;
    private Game game;
    private String videoLink;
    private String title;
    private String date;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    @Column
    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
    @Column
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
