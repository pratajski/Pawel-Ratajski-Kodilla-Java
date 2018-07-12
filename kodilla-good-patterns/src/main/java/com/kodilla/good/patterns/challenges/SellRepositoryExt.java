package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SellRepositoryExt implements SellRepository {
    @Override
    public boolean createSell(User user, LocalDateTime sellDate)
    {
        System.out.println("User bought" );
        return true;
    }
}
