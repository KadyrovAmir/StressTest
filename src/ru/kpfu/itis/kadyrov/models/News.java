package ru.kpfu.itis.kadyrov.models;

import javax.persistence.*;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int game_id;
    @Column
    private String title;
    @Column
    private String text;
    @Column
    private String date;

    public News(int id, int game_id, String title, String text, String date) {
        this.id = id;
        this.game_id = game_id;
        this.title = title;
        this.text = text;
        this.date = date;
    }

    public News(int game_id, String title, String text) {
        this.game_id = game_id;
        this.title = title;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

