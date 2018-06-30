package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SellItem {
    public boolean sell(final User user, final LocalDateTime sellDate) {
        System.out.println("User: " + user.getName() + user.getSurname()
                + " bought: " + sellDate.toString());

        return true;
    }
}
