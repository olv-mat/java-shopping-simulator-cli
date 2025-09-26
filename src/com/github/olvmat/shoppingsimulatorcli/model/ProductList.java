package com.github.olvmat.shoppingsimulatorcli.model;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    private final List<Product> products = new ArrayList<>();

    public ProductList() {
        this.products.add(new Product("Iphone 14 Pro", 6899.99));
        this.products.add(new Product("Dell XPS 13 Laptop", 8299.50));
        this.products.add(new Product("Samsung 55\" Smart TV", 3499.00));
        this.products.add(new Product("Sony WH-1000XM4 Headphones", 1599.90));
        this.products.add(new Product("PlayStation 5", 4499.00));
        this.products.add(new Product("Nespresso Coffee Maker", 499.00));
        this.products.add(new Product("Kindle Paperwhite", 699.00));
        this.products.add(new Product("LG Ultrawide 34\" Monitor", 2399.00));
        this.products.add(new Product("Logitech Mechanical Keyboard", 799.90));
        this.products.add(new Product("ThunderX3 Gaming Chair", 1299.00));
    }

    public List<Product> getProducts() {
        return List.copyOf(this.products);
    }
}
