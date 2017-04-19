package ru.kpfu.itis.kadyrov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.kpfu.itis.kadyrov.models.Game;
import ru.kpfu.itis.kadyrov.services.GameService;
/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Controller
public class GameController {
    private GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping(path = "/game", method = RequestMethod.GET)
    public ModelAndView doGet(ModelMap modelMap, @RequestParam(value = "id", required = true) Integer id) {
        Game game = gameService.findById(id);
        modelMap.put("game", game);
        return new ModelAndView("game", modelMap);
    }
}
