package com.github.olvmat.shoppingsimulatorcli.model.list;

import com.github.olvmat.shoppingsimulatorcli.model.product.Product;

public class ProductList extends GenericList<Product> {
    public ProductList() {
        this.add(new Product("Iphone", 5680.50));
    }
}
