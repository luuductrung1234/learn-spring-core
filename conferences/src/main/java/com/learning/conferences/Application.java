package com.learning.conferences;

import com.learning.conferences.service.SpeakerService;
import com.learning.conferences.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();

        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}