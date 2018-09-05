package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements ObservableHomeWork {
    private final List<ObserverHomeWork> observers;
    private final List<String> tasks;
    private final String name;

    public Student(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addPost(String post) {
        tasks.add(post);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverHomeWork observerHomeWork) {
        observers.add(observerHomeWork);
    }

    @Override
    public void notifyObservers() {
        for (ObserverHomeWork observerHomeWork : observers) {
            observerHomeWork.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverHomeWork observerHomeWork) {
        observers.remove(observerHomeWork);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
