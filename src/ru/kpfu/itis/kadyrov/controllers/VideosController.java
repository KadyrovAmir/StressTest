package ru.kpfu.itis.kadyrov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.kpfu.itis.kadyrov.models.Game;
import ru.kpfu.itis.kadyrov.models.Video;
import ru.kpfu.itis.kadyrov.services.VideoService;

import javax.persistence.Column;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Controller
public class VideosController {
    private VideoService videoService;
    @Autowired
    public VideosController(VideoService videoService) {
        this.videoService = videoService;
    }

    @RequestMapping(path = "/video", method = RequestMethod.GET)
    public ModelAndView doGet(ModelMap modelMap, @RequestParam(value = "id") Integer id) {
        Video video = videoService.findVideoById(id);
        modelMap.put("video", video);
        return new ModelAndView("video-description", modelMap);
    }
}
