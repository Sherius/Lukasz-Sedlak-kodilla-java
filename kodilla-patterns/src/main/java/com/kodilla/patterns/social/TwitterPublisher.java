package com.kodilla.patterns.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Using Twitter Publisher";
    }
}
