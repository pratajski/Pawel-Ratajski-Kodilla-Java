package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SellRequestRetriever {
    public SellRequest retrieve() {
        User user = new User ("John", "Wekl");
        LocalDateTime SellDate = LocalDateTime.of(2017, 8, 1 , 12, 0);
        Product product = new Product("Computer");

        return new SellRequest(user, SellDate, product);
    }
}
