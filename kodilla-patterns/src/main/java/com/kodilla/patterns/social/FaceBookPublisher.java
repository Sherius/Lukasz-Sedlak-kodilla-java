package com.kodilla.patterns.social;

public class FaceBookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Using Facebook Publisher";
    }
}
