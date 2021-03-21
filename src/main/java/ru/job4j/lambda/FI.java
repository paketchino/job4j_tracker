package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        String[] strings = {
                "Roman",
                "Evgeny",
                "Hercules",
                "Cules"
        };
        Comparator<String> comparator = (left, right) -> right.compareTo(left);
        Arrays.sort(strings, comparator);
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("----------");
        Comparator<String> comparator1 = (left, right) -> right.length() - left.length();
        Arrays.sort(strings, comparator1);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
