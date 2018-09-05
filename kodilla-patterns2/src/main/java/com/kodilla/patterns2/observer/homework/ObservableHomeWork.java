package com.kodilla.patterns2.observer.homework;

public interface ObservableHomeWork {
    void registerObserver(ObserverHomeWork observerHomeWork);
    void notifyObservers();
    void removeObserver(ObserverHomeWork observerHomeWork);
}