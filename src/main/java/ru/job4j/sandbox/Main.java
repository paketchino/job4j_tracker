package ru.job4j.sandbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        Person person = new Person("Roman");
        Person person1 =new Person("Evgenya");
        Person person3 = new Person("Water");

        people.add(person);
        people.add(person1);
        people.add(person3);

        Iterator<Person> iterator = people.iterator();
    }
}
