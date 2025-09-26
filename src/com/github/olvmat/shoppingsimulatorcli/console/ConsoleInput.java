package com.github.olvmat.shoppingsimulatorcli.console;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner scanner = new Scanner(System.in);

    public int readInt() {
        return this.scanner.nextInt();
    }
}
