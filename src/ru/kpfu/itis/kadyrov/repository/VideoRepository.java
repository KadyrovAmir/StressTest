package ru.kpfu.itis.kadyrov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.kadyrov.models.Video;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
public interface VideoRepository extends JpaRepository<Video, Integer> {
    Video findById(int id);
}
