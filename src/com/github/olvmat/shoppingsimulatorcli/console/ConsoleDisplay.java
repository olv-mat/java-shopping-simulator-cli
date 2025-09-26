package com.github.olvmat.shoppingsimulatorcli.console;

import java.util.List;

public class ConsoleDisplay {
    public void display(String content) {
        System.out.println("=".repeat(50));
        System.out.print(content);
    }

    public <T> void displayList(List<T> list) {
        System.out.println("=".repeat(50));
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d - %s%n", (i + 1), list.get(i));
        }
    }
}
