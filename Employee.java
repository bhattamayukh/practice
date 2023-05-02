package com.practice;

import java.util.*;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }



    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 1, 100000));
        employees.add(new Employee("Jane", 2, 90000));
        employees.add(new Employee("David", 3, 120000));
        employees.add(new Employee("Mary", 4, 110000));
        employees.add(new Employee("Tom", 5, 95000));

        // Sort employees by salary in descending order
        Collections.sort(employees, Comparator.comparing(Employee::getSalary).reversed());

        // Display the details of the top 3 highest-paid employees
        for (int i = 0; i < 3 && i < employees.size(); i++) {
            Employee e = employees.get(i);
            System.out.println("Name: " + e.getName() + ", ID: " + e.getId() + ", Salary: $" + e.getSalary());
        }
    }
    }

