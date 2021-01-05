package ru.job4j.ex;

import java.util.Arrays;

public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Roman", "Sergey"};
        int middle = names.length / 2;
        for (int index = 0; index <= middle; index++) {
            String temp = names[index];
            names[index] = names[middle - index];
            names[middle - index] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
