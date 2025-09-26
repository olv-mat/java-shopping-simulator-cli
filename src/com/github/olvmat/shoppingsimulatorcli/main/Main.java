package com.github.olvmat.shoppingsimulatorcli.main;

import com.github.olvmat.shoppingsimulatorcli.console.ConsoleDisplay;
import com.github.olvmat.shoppingsimulatorcli.console.ConsoleInput;
import com.github.olvmat.shoppingsimulatorcli.model.Card;
import com.github.olvmat.shoppingsimulatorcli.model.ProductList;
import com.github.olvmat.shoppingsimulatorcli.model.Product;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        ConsoleInput consoleInput = new ConsoleInput();
        Card card = new Card("Matheus Oliveira", 10000);
        ProductList productList = new ProductList();

        String cardholder = card.getCardholder();
        List<Product> products = productList.getProducts();
        List<Product> shoppingList = new LinkedList<>();

        consoleDisplay.display("Java Shopping Simulator\n");
        while (true) {
            consoleDisplay.display(String.format("Hello %s, What do You Want to Buy?%n", cardholder));
            consoleDisplay.display(String.format("Limit: %.2f%n", card.getLimit()));
            consoleDisplay.displayList(products);

            int option;
            do {
                consoleDisplay.display("Option: ");
                option = consoleInput.readInt();
            } while (option > (products.size() + 1));

            Product product = products.get(option - 1);
            boolean purchaseStatus = card.purchase(product);
            if (purchaseStatus) {
                shoppingList.add(product);
            }

            consoleDisplay.display("Want to Buy Something Else?\n");
            consoleDisplay.display("""
                    1 - Yes
                    2 - No
                    """);
            consoleDisplay.display("Option: ");
            switch (consoleInput.readInt()) {
                case 1:
                    break;
                case 2:
                    consoleDisplay.displayList(shoppingList);
                    return;
                default:
                    consoleDisplay.display("Invalid Option\n");
            }
        }
    }
}
