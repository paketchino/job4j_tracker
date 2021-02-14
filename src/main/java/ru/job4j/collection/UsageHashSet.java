package ru.job4j.collection;

import search.Person;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("Lada");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String name : autos ) {
            System.out.println(name);
        }

    }
}
