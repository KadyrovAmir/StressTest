package ru.kpfu.itis.kadyrov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.kadyrov.models.News;

import java.util.List;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
public interface NewsRepository extends JpaRepository<News, Integer> {
    List<News> findAll();
}
