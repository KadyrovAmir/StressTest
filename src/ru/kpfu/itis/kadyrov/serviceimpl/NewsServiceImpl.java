package ru.kpfu.itis.kadyrov.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.kadyrov.models.News;
import ru.kpfu.itis.kadyrov.repository.NewsRepository;
import ru.kpfu.itis.kadyrov.services.NewsService;

import java.util.List;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {
    NewsRepository newsRepository;

    @Autowired
    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> findAll() {
        return newsRepository.findAll();
    }
}
