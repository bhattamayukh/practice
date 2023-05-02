package com.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shape {
    private String type;
    private String color;

    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        // create a list of 5 shape objects
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape("circle", "red"));
        shapes.add(new Shape("square", "blue"));
        shapes.add(new Shape("triangle", "green"));
        shapes.add(new Shape("rectangle", "yellow"));
        shapes.add(new Shape("hexagon", "purple"));

        // create a map to store the count of each shape type
        Map<String, Integer> countMap = new HashMap<>();

        // loop through the list of shapes and count each type
        for (Shape shape : shapes) {
            String type = shape.getType();
            if (countMap.containsKey(type)) {
                countMap.put(type, countMap.get(type) + 1);
            } else {
                countMap.put(type, 1);
            }
        }

        // display the total count of shapes of each type
        for (String type : countMap.keySet()) {
            int count = countMap.get(type);
            System.out.println("Total count of " + type + " shapes: " + count);
        }
    }
}

