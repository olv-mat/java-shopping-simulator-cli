package com.github.olvmat.shoppingsimulatorcli.model.list;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericList<T> {
    private final List<T> items = new ArrayList<>();

    public List<T> getItems() {
        return List.copyOf(this.items);
    }

    public void add(T item) {
        this.items.add(item);
    }
}
