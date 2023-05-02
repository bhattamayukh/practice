package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product 1", 10.0, 2));
        productList.add(new Product("Product 2", 20.0, 3));
        productList.add(new Product("Product 3", 15.0, 1));
        productList.add(new Product("Product 4", 5.0, 4));
        productList.add(new Product("Product 5", 30.0, 2));

        double totalCost = 0.0;
        for (Product product : productList) {
            totalCost += product.getTotalCost();
            System.out.println("Product: " + product.name + ", Price: $" + product.price + ", Quantity: " + product.quantity + ", Total Cost: $" + product.getTotalCost());
        }
        System.out.println("Total Cost of all Products: $" + totalCost);
    }
}
