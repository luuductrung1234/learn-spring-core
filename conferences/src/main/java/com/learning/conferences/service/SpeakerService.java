package com.learning.conferences.service;

import java.util.List;

import com.learning.conferences.model.Speaker;

public interface SpeakerService {
    public List<Speaker> findAll();
}