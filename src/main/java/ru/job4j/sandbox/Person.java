package ru.job4j.sandbox;

public class Person {
    private String names;

    public Person(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names='" + names + '\'' +
                '}';
    }
}
