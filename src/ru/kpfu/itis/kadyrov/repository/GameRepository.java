package ru.kpfu.itis.kadyrov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.kadyrov.models.Game;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
public interface GameRepository extends JpaRepository <Game, Integer> {
    Game findByName(String name);
}
