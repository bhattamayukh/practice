package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public boolean isDomestic() {
        if (type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat") || type.equalsIgnoreCase("cow") || type.equalsIgnoreCase("horse") || type.equalsIgnoreCase("goat")) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fido", "Dog"));
        animals.add(new Animal("Tom", "Cat"));
        animals.add(new Animal("Bessie", "Cow"));
        animals.add(new Animal("Blackie", "Horse"));
        animals.add(new Animal("Billy", "Goat"));

        System.out.println("List of domestic animals:");
        for (Animal animal : animals) {
            if (animal.isDomestic()) {
                System.out.println(animal.getName());
            }
        }
    }
}
