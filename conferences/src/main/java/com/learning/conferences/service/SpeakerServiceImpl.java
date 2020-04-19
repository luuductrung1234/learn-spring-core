package com.learning.conferences.service;

import java.util.List;

import com.learning.conferences.model.Speaker;
import com.learning.conferences.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    /**
     * @param repository the repository to set
     */
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}