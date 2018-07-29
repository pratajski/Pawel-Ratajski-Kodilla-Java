package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask (final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", "Warsaw", "Car");
            case PAINTING:
                return new PaintingTask("Paint", "Red", "Home");
            case SHOPPING:
                return new ShoppingTask("Shopping", "paint", 8);
            default:
                return null;
        }

    }
}
