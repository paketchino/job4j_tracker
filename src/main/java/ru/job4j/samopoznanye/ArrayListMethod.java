package ru.job4j.samopoznanye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Roman");
        myList.add("Misha");
        myList.add("Alexey");
        myList.add("Evgenya");

        List<Integer> list = List.of(3, 8, 13);
        System.out.println(list);

        List<String> myList2 = List.copyOf(myList);
        System.out.println(myList2);

        System.out.println(myList.get(0));
    }
}
