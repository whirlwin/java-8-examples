package org.whirlwin.java8.examples.optional;

import java.util.Optional;

public class FlatMapExample {

    public static void main(String[] args) {
        Person person = new Person(Optional.of(new Phone(Optional.of("123456789"))));

        Optional<Optional<String>> p = person.getPhone().map(Phone::getNumber);

        person.getPhone()
                .flatMap(Phone::getNumber) // Calling just map here would yield Optional<Optional<String>>
                .filter((number) -> number.equals("123456789"))
                .ifPresent(System.out::println);
    }

    private static class Person {

        private Optional<Phone> phone;

        public Person(Optional<Phone> phone) {
            this.phone = phone;
        }

        public Optional<Phone> getPhone() {
            return phone;
        }
    }

    private static class Phone {

        private Optional<String> number;

        public Phone(Optional<String> number) {
            this.number = number;
        }

        public Optional<String> getNumber() {
            return number;
        }
    }
}
