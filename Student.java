package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int rollNumber;
    private double marks;
    
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    public double calculatePercentage() {
        return (marks / 500) * 100;
    }
    
    public String toString() {
        return name + " (Roll Number: " + rollNumber + "): " + marks + " out of 500";
    }

public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("John", 101, 420));
    students.add(new Student("Jane", 102, 450));
    students.add(new Student("Mike", 103, 390));
    students.add(new Student("Emily", 104, 480));
    students.add(new Student("David", 105, 350));
    
    for (Student student : students) {
        System.out.println(student.toString() + " - Percentage: " + student.calculatePercentage());
    }
}
}

