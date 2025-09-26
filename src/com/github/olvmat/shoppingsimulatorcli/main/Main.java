package com.github.olvmat.shoppingsimulatorcli.main;

import com.github.olvmat.shoppingsimulatorcli.console.ConsoleDisplay;
import com.github.olvmat.shoppingsimulatorcli.console.ConsoleInput;
import com.github.olvmat.shoppingsimulatorcli.model.card.Card;
import com.github.olvmat.shoppingsimulatorcli.model.list.ProductList;
import com.github.olvmat.shoppingsimulatorcli.model.list.ShoppingList;
import com.github.olvmat.shoppingsimulatorcli.model.product.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        ConsoleInput consoleInput = new ConsoleInput();

        Card card = new Card("Matheus Oliveira", 10000);
        ProductList productList = new ProductList();
        ShoppingList shoppingList = new ShoppingList();

        List<Product> products = productList.getProducts();

        consoleDisplay.display("Java Shopping Simulator\n");
        while (true) {
            consoleDisplay.display("What do You Want to Buy?\n");
            System.out.println("=".repeat(40));
            for (int i = 0; i < products.size(); i++) {
                System.out.printf("%d - %s%n", (i + 1), products.get(i));
            }
            int option;
            do {
                consoleDisplay.display("Option: ");
                option = consoleInput.readInt();
            } while (option > (products.size() + 1));
            Product product = products.get(option - 1);
            System.out.println(product);
            consoleDisplay.display("Want to Buy Something Else?\n");
            consoleDisplay.display("""
                    1 - Yes
                    2 - No (Exit)
                    """);
            consoleDisplay.display("Option: ");
            switch (consoleInput.readInt()) {
                case 1:
                    break;
                case 2:
                    return;
                default:
                    consoleDisplay.display("Invalid Option\n");
            }
        }
    }
}
