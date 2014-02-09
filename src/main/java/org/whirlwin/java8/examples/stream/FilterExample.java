package org.whirlwin.java8.examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 20),
                new Person("Jane", 21),
                new Person("Joe", 22)
        );

        printPeopleAboveAge20(people);
        printPeopleWithLongName(people);
    }

    public static void printPeopleAboveAge20(List<Person> people) {
        List<Person> peopleAboveAge20 = people.stream().filter((p) -> p.getAge() > 20).collect(Collectors.toList());
        System.out.println(peopleAboveAge20);
    }

    public static void printPeopleWithLongName(List<Person> people) {
        List<Person> peopleWithLongName = people.stream().filter((p) -> p.getName().length() > 3)
                .collect(Collectors.toList());
        System.out.println(peopleWithLongName);
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

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
