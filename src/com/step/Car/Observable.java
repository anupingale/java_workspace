package com.step.Car;

import java.util.ArrayList;
import java.util.List;

abstract class Observable {
    private List<Observer> observers;

    Observable() {
        this.observers = new ArrayList<>();
    }

    void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    void notify(String notification) {
        for (Observer observer : observers) {
            observer.notify(notification);
        }
    }

}

