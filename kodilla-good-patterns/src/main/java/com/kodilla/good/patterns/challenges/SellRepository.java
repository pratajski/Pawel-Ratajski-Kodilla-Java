package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface SellRepository {
    boolean createSell(User user, LocalDateTime sellDate);
}

