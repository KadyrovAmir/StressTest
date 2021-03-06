package ru.kpfu.itis.kadyrov.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.kadyrov.models.Game;
import ru.kpfu.itis.kadyrov.repository.GameRepository;
import ru.kpfu.itis.kadyrov.services.GameService;

import java.util.List;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Service("gameService")
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;
    @Autowired
    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game findById(int id) {
        return gameRepository.findById(id);
    }
}
