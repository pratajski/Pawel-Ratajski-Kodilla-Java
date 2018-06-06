package com.kodilla.exception.test;

public class RouteNotFoundException extends Throwable {
    public void Message() {
        System.out.println("The airport does not exist");
    }
}
