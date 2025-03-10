package com.mystore.app;

public class Product {

    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("In Product constructor: " + this.name);
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
    }
}
