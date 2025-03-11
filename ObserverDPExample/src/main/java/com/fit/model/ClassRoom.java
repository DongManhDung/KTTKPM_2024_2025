package com.fit.model;

import com.fit.observer.Observer;
import com.fit.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom implements Subject {

    private Long id;
    private String name;
    private List<Observer> students = new ArrayList<>();

    public ClassRoom(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer) {
        students.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        System.out.println("Notify classRoom " + name + " : " + message);
        for (Observer student : students) {
            student.update(message);
        }
    }
}
