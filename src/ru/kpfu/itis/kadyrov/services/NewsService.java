package ru.kpfu.itis.kadyrov.services;

import ru.kpfu.itis.kadyrov.models.News;

import java.util.List;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
public interface NewsService {
    List<News> findAll();
}
