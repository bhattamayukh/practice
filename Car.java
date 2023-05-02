package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter and Setter methods for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and Setter methods for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }

    // Main method to create a list of 5 car objects and display their details
    public static void main(String[] args) {
        // Create a list of 5 car objects
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Honda", "Accord", 2015));
        cars.add(new Car("Toyota", "Camry", 2014));
        cars.add(new Car("Ford", "Fusion", 2016));
        cars.add(new Car("Chevrolet", "Malibu", 2013));
        cars.add(new Car("Nissan", "Altima", 2012));

        // Display details of the cars
        for (Car car : cars) {
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println();
        }
    }
}

