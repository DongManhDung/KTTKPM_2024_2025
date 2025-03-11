package com.fit;

import com.fit.model.ClassMonitor;
import com.fit.model.ClassRoom;
import com.fit.model.Department;
import com.fit.model.Student;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(1L, "Khoa công nghệ thông tin");

        ClassRoom classRoom1 = new ClassRoom(1L, "Lớp 1");
        ClassRoom classRoom2 = new ClassRoom(2L, "Lớp 2");

        department.addClassRoom(classRoom1);
        department.addClassRoom(classRoom2);

        Student student1 = new Student(1L, "Nguyễn Văn A");
        Student student2 = new Student(2L, "Nguyễn Thị X");
        Student student3 = new Student(3L, "Trần Văn B");
        Student student4 = new Student(4L, "Trần Thị Y");


        classRoom1.addObserver(student1);
        classRoom1.addObserver(student2);
        classRoom2.addObserver(student3);
        classRoom2.addObserver(student4);

        ClassMonitor classMonitor = new ClassMonitor(classRoom1);
        classMonitor.sendNotification("Học sinh ngày mai kiểm tra giữa kỳ!");

        department.notifyAllClasses("Đã có lịch thi giữa kỳ!");
    }
}