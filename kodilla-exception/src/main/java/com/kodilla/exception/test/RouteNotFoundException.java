package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException() {
        super("Route not found.");
    }
}