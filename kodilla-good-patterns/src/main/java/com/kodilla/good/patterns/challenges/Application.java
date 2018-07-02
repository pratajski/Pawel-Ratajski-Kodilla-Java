package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        SellRequestRetriever sellRequestRetriever = new SellRequestRetriever();
        SellRequest sellRequest = sellRequestRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.process(sellRequest);
/*

 */


    }
}