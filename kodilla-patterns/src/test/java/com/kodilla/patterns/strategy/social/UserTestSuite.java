package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Maciej Szamotulski");

        //When
        String stevenShare = steven.sharePost();
        System.out.println("Steven should use: " + stevenShare);
        String johnShare = john.sharePost();
        System.out.println("John should use: " + johnShare);
        String kodillaShare = kodilla.sharePost();
        System.out.println("Maciej should use: " + kodillaShare);

        //Then
        Assert.assertEquals("FaceBook", stevenShare);
        Assert.assertEquals("Snapchat", johnShare);
        Assert.assertEquals("Twitter", kodillaShare);


    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenSharingStrategy = steven.sharePost();
        System.out.println("Steven should use: " + stevenSharingStrategy);
        steven.setUserStrategy(new TwitterPublisher());
        stevenSharingStrategy = steven.sharePost();
        System.out.println("Steven now use: " + stevenSharingStrategy);

        //Then
        Assert.assertEquals("Twitter", stevenSharingStrategy);


    }
}
