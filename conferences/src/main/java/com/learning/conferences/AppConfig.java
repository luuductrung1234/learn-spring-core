package com.learning.conferences;

import com.learning.conferences.repository.HibernateSpeakerRepositoryImpl;
import com.learning.conferences.repository.SpeakerRepository;
import com.learning.conferences.service.SpeakerService;
import com.learning.conferences.service.SpeakerServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl(getSpeakerRepository());
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}