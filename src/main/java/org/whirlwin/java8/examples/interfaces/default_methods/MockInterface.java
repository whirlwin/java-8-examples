package org.whirlwin.java8.examples.interfaces.default_methods;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface MockInterface {

    static final List<String> PEOPLE = new ArrayList<String>() {{
        add("John");
        add("Jane");
        add("Joe");
    }};

    void addPerson(String name);

    default List<String> getPeople() {
        return PEOPLE;
    }
}
