package ru.kpfu.itis.kadyrov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.kpfu.itis.kadyrov.models.News;
import ru.kpfu.itis.kadyrov.services.NewsService;

import java.util.List;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Controller
public class NewsController {
    private NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @RequestMapping(path = "/news", method = RequestMethod.GET)
    public ModelAndView doGet(ModelMap modelMap) {
        List<News> news = newsService.findAll();
        modelMap.put("all_news", news);
        return new ModelAndView("news-list", modelMap);
    }
}
