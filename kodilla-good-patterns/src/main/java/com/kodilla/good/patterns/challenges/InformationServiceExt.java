package com.kodilla.good.patterns.challenges;

public class InformationServiceExt implements InformationService{
    @Override
    public void inform(User user)
    {
        System.out.println("User was informed");
    }
}
