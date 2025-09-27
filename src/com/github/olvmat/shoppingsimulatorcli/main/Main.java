package com.github.olvmat.shoppingsimulatorcli.main;

import com.github.olvmat.shoppingsimulatorcli.console.ConsoleDisplay;
import com.github.olvmat.shoppingsimulatorcli.console.ConsoleInput;
import com.github.olvmat.shoppingsimulatorcli.model.CreditCard;
import com.github.olvmat.shoppingsimulatorcli.model.ProductList;
import com.github.olvmat.shoppingsimulatorcli.model.Product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        ConsoleInput consoleInput = new ConsoleInput();
        CreditCard creditCard = new CreditCard("Matheus Oliveira", 10000);
        ProductList productList = new ProductList();

        String cardholder = creditCard.getCardholder();
        List<Product> products = productList.getProducts();
        List<Product> shoppingList = new LinkedList<>();

        consoleDisplay.display("Java Shopping Simulator\n");
        while (true) {
            consoleDisplay.display(String.format("Hello %s, What do You Want to Buy?%n", cardholder));
            consoleDisplay.display(String.format("Limit: %.2f%n", creditCard.getLimit()));
            consoleDisplay.displayList("Available Products:", products);

            int option = readValidOption(consoleDisplay, consoleInput, products.size());
            Product product = products.get(option - 1);
            if (creditCard.purchase(product)) {
                shoppingList.add(product);
            }

            consoleDisplay.displayMenu("Want to Buy Something Else?", "Yes", "No");
            option = readValidOption(consoleDisplay, consoleInput, 2);
            if (option == 2) {
                Collections.sort(shoppingList);
                consoleDisplay.displayList("Your Shopping Cart:", shoppingList);
                break;
            }
        }
    }

    private static int readValidOption(
            ConsoleDisplay consoleDisplay,
            ConsoleInput consoleInput,
            int limit
    ) {
        int option;
        do {
            consoleDisplay.display("Option: ");
            option = consoleInput.readInt();
            if (option < 1 || option > limit) {
                consoleDisplay.display("Invalid Option, Try Again!\n");
            }
        } while (option < 1 || option > limit);
        return  option;
    }
}
