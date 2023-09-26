package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Person("Artem", "Kushch", 19)
                        .equals
                                (new Person("Artem", "Kushch", 19)));

        Person artem = new Person("Artem", "Kushch", 19);
        Person vlad = new Person("Vladyslav", "Hordiienko", 18);

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        String artemJson = gson.toJson(artem);

        System.out.println("\nJSON: " + artemJson);

        Person artem2 = gson.fromJson(artemJson, Person.class);

        boolean isHashcodeEquals = artem.hashCode() == artem2.hashCode();

        if (isHashcodeEquals) {
            System.out.println("\nEquals check for deserialized object = " + artem.equals(artem2));
        } else {
            System.out.println("No sense in using equals, as the hash codes aren't the same");
        }
    }
}

final class Person {
    private final String name, surname;
    private final int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Person p = (Person) obj;

        return Objects.equals(name, p.name) &&
                Objects.equals(surname, p.surname) &&
                age == p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}