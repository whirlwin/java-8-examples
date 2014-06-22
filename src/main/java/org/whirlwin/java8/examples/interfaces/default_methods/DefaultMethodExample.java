package org.whirlwin.java8.examples.interfaces.default_methods;

import java.util.Collections;
import java.util.List;

public class DefaultMethodExample {

    public static void main(String[] args) {
        MockInterface firstMock = new MockInterfaceImpl();
        firstMock.addPerson("Tom");
        System.out.println(firstMock.getPeople());

        // It is possible to use this syntax as the interface only has one abstract method
        MockInterface secondMock = MockInterface.PEOPLE::add;
        secondMock.addPerson("Jessie");
        System.out.println(secondMock.getPeople());

        printPeopleSorted(secondMock.getPeople());
    }

    private static void printPeopleSorted(List<String> people) {
        Collections.sort(people, (p1, p2) -> p1.compareTo(p2));
        System.out.println(people);
    }
}
