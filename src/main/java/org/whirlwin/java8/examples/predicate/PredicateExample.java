package org.whirlwin.java8.examples.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> people = Arrays.asList("John", null, "Joe");
        printNonNullNames(people);
    }

    private static void printNonNullNames(List<String> people) {
        System.out.println(people.stream().filter(Objects::nonNull).collect(Collectors.toList()));
    }
}
