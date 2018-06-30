package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

    public interface SellService {
        boolean sell(User user, LocalDateTime sellDate, Product product);
}
