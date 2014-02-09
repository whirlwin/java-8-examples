package org.whirlwin.java8.examples.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MappingExample {

    private static final Map<Integer, String> DIRTY_NAME_REGISTRY = new HashMap() {{
        put(1, "..John Doe..");
    }};

    public static void main(String[] args) {
        Optional<String> dirtyName = getDirtyName(1);
        printName(dirtyName);
    }

    public static Optional<String> getDirtyName(int id) {
        return Optional.ofNullable(DIRTY_NAME_REGISTRY.get(id));
    }

    public static void printName(Optional<String> dirtyName) {
        dirtyName.map((name) -> name.replaceAll("\\.", "")).ifPresent(System.out::println);
    }
}
