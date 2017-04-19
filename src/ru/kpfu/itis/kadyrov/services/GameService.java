package ru.kpfu.itis.kadyrov.services;

import ru.kpfu.itis.kadyrov.models.Game;

import java.util.List;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
public interface GameService {
    List<Game> getAll();
}
