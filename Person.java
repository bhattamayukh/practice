package com.practice;

public class Person {
    String name;
    int age;
    
    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.printDetails();
        
        Person person2 = new Person("Mayukh", 23);
        person2.printDetails();
    }
}
