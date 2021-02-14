package ru.job4j.ex;

public class Fuct {
    public static int fact(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("The number is less than 1");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl = rsl * index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
