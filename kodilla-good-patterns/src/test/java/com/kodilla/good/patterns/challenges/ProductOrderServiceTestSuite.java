package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;

public class ProductOrderServiceTestSuite {
    @Test
    public void testProductOrderService () {
        //Given
        LocalTime localTime = LocalTime.now();
        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        sellRequestRetriever.retrieve();


        //when

        //Then

    }

}
