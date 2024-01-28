package org.example;

public class Category {
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }
    private String name;
    Product[] products;
    Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
}
