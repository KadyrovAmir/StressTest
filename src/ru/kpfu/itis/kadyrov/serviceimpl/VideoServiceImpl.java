package ru.kpfu.itis.kadyrov.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.kadyrov.models.Video;
import ru.kpfu.itis.kadyrov.repository.VideoRepository;
import ru.kpfu.itis.kadyrov.services.VideoService;

/**
 * Created by Amir Kadyrov
 * Date: 19.04.2017
 */
@Service("videoService")
public class VideoServiceImpl implements VideoService {
    private VideoRepository videoRepository;

    @Autowired
    public VideoServiceImpl(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public Video findVideoById(int id) {
        return videoRepository.findById(id);
    }
}
