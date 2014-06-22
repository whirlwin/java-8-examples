package org.whirlwin.java8.examples.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> people = new HashMap<String, String>() {{
            put("John", "123");
            put("Jane", "456");
            put("Joe", "789");
        }};

        people.forEach((s, s2) -> System.out.println(s + s2));
    }
}
