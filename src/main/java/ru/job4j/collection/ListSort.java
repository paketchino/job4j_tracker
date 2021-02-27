package ru.job4j.collection;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Integer.*;

public class ListSort {
    public static void main(String[] args) {
        String roman = "Roman";
        String evgen = "Evgen";
        int rslStr = roman.compareTo(evgen);
        System.out.println(rslStr);

        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
    }
}
