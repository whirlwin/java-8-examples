package org.whirlwin.java8.examples.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

    private static final Map<Integer, String> NAME_REGISTRY = new HashMap<Integer, String>() {{
        put(1, "John Doe");
    }};

    public static void main(String[] args) {
        Optional<String> johnDoe = getNameById(1);
        printName(johnDoe);

        Optional<String> janeDoe = getNameById(2);
        printName(janeDoe);
    }

    public static Optional<String> getNameById(int id) {
        String name = NAME_REGISTRY.get(id);
        return Optional.ofNullable(name);
    }

    public static void printName(Optional<String> name) {
        if (name.isPresent()) {
            System.out.println(name.get());
        } else {
            System.out.println("Warning: Name not set");
        }
    }
}
