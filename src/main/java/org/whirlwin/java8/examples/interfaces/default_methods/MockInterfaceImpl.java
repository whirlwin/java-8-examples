package org.whirlwin.java8.examples.interfaces.default_methods;

public class MockInterfaceImpl implements MockInterface {

    @Override
    public void addPerson(String name) {
        PEOPLE.add(name);
    }
}
