package com.kodilla.good.patterns.challenges;

public class SellDto {
    public User user;
    public boolean isSell;

    public SellDto(final User user, final boolean isSell) {
        this.user = user;
        this.isSell = isSell;
    }

    public User getUser() {
        return user;
    }

    public boolean isSell() {
        return isSell;
    }
}
