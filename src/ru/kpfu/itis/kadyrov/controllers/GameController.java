package ru.kpfu.itis.kadyrov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Controller
public class GameController {
    @RequestMapping(path = "/games", method = RequestMethod.GET)
    public String hello(ModelMap modelMap, @RequestParam(value = "game", required = false) String param) {
        modelMap.put("game", param);
        return "games-list";
    }
}
