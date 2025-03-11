package com.fit.model;

import com.fit.observer.Observer;

public class Student implements Observer {

    private Long id;
    private String name;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " received message: " + message);
    }
}
