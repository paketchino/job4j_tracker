package ru.job4j.samopoznanye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Roman");
        arrayList.add("Alexey");
        arrayList.add("Elena");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println(arrayList);
    }
}
