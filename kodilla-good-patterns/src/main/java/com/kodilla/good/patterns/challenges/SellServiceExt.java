package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SellServiceExt implements SellService{
    @Override
    public boolean sell(User user, LocalDateTime sellDate, Product product){
        System.out.println("Service");
        return true;
    }
}
