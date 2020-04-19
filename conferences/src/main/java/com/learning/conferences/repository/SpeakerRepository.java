package com.learning.conferences.repository;

import java.util.List;

import com.learning.conferences.model.Speaker;

public interface SpeakerRepository {
    public List<Speaker> findAll();
}