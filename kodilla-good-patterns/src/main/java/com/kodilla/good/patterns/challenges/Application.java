package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        InformationServiceExt informationServiceExt = new InformationServiceExt();
        SellServiceExt sellServiceExt = new SellServiceExt();
        SellRepositoryExt sellRepositoryExt = new SellRepositoryExt();
        ProductOrderService productOrderService = new ProductOrderService(informationServiceExt, sellServiceExt, sellRepositoryExt );

        User user = new User("Some", "User");
        Product product = new Product("Some product");
        SellRequest sellRequest = new SellRequest(user, LocalDateTime.now(), product);
        productOrderService.process(sellRequest);
    }
}