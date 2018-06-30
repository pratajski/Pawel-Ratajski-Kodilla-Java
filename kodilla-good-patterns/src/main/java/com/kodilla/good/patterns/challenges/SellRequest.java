package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SellRequest {
    private User user;
    private LocalDateTime sellDate;
    private Product product;

    public SellRequest(final User user, final LocalDateTime sellDate, final Product product) {
        this.user = user;
        this.sellDate = sellDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getSellDate() {
        return sellDate;
    }

    public Product getProduct() {
        return product;
    }
}
