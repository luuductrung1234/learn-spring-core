package com.learning.conferences.repository;

import java.util.ArrayList;
import java.util.List;

import com.learning.conferences.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Trung");
        speaker.setLastName("Luu");
        speakers.add(speaker);
        return speakers;
    }
}