package ru.job4j.samopoznanye;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Zaur");
        arrayList.add("Ivan");
        arrayList.add("Roman");
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Zebra");
        arrayList.addAll(arrayList2);

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
