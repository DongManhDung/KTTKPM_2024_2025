package com.fit.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private String departmentName;
    private List<ClassRoom> classRooms = new ArrayList<>();

    public Department(Long id, String departmentName) {
        this.id = id;
        this.departmentName = departmentName;
    }

    public void addClassRoom(ClassRoom classRoom) {
        classRooms.add(classRoom);
    }

    public void notifyAllClasses(String message) {
        // Notify all classes in this department
        System.out.println("Notifying all classes in department " + departmentName + " with message: " + message);
        for (ClassRoom classRoom : classRooms) {
            classRoom.notifyObservers(message);
        }
    }
}
