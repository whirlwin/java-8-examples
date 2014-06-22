package org.whirlwin.java8.examples.supplier;

import java.util.function.Consumer;

public class SupplierExample {

    public static void main(String[] args) {
        Consumer<String> greeter = (p) -> System.out.println("Hello, " + p);
        greeter.accept("Skywalker");
    }
}
