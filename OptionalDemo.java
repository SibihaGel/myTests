package org.example;

import java.util.*;

class OptionalDemo {
    public static void main(String[] args) {

        Optional<String> optional = Optional.empty();
        System.out.println(optional.isPresent()); // is Box?
        System.out.println(optional.isEmpty()); // is Empty?

        optional = Optional.of("Hello");

        System.out.println(optional);
        optional = Optional.ofNullable(null); // Коробочка пуста и работает -> optional.orElse("World");

        System.out.println("-----------");
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());

        String orElse = optional
                .map(String:: toUpperCase)
                .orElseGet(()->{
                    // todo someth
                    return "world";
                });
        optional.ifPresentOrElse(System.out::println,()-> System.out.println("world"));

        System.out.println(orElse);
        System.out.println(" -------------------------------");

        Person serg = new Person("Serg", "sib@maj");
        System.out.println(serg.getEmail().map(String::toUpperCase).orElse("Нет почты"));
    }
}
class Person {
    private final String name;
    private final String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
