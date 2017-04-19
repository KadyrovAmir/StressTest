package ru.kpfu.itis.kadyrov.services;

import ru.kpfu.itis.kadyrov.models.Video;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
public interface VideoService {
    Video findVideoById(int id);
}
