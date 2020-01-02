package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User milenials = new Millenials("FaceBook publisher");
        User yGeneration = new YGeneration("Twitter publisher");
        User zGeneration = new ZGeneration("Snapchat publisher");

        //When
        String milenialsSocial = milenials.sharePost();
        System.out.println("Milenials publisher: " + milenialsSocial);
        String yGenerationSocial = yGeneration.sharePost();
        System.out.println("YGeneration publisher: " + yGenerationSocial);
        String zGenerationSocial = zGeneration.sharePost();
        System.out.println("ZGeneration publisher: " + zGenerationSocial);

        //Then
        Assert.assertEquals("Using Facebook Publisher", milenialsSocial);
        Assert.assertEquals("Using Twitter Publisher", yGenerationSocial);
        Assert.assertEquals("Using Snapchat Publisher", zGenerationSocial);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User milenial = new Millenials("Milenial publisher");
        //When
        String milenialsSocial = milenial.sharePost();
        System.out.println("Milenials publisher: " + milenialsSocial);
        milenial.setSocialPublisher(new TwitterPublisher());
        milenialsSocial = milenial.sharePost();
        System.out.println("Milenials now publisher: " + milenialsSocial);
        //Then
        Assert.assertEquals("Using Twitter Publisher", milenialsSocial);
    }
}
