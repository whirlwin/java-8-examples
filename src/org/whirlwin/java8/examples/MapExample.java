package org.whirlwin.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 21),
                new Person("Joe", 22)
        );

        printAges(people);
        printNames(people);
    }

    private static void printAges(List<Person> people) {
        List<Integer> ages = people.stream().map(Person::getAge).collect(Collectors.toList());
        System.out.println(ages);
    }

    private static void printNames(List<Person> people) {
        List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(names);
    }

    private static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
