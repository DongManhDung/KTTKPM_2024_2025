package com.fit.model;

public class ClassMonitor {
    private ClassRoom classRoom;

    public ClassMonitor(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public void sendNotification(String message){
        // Send message to all students
        System.out.println("Monitor is sending message to all students: " + message);
        classRoom.notifyObservers(message);
    }
}
