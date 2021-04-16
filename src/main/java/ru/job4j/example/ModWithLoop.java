package ru.job4j.example;

public class ModWithLoop {
    public static int number(int n, int d) {
        int quotient = (n / d);
        for (int i = 0; i < d; i++) {
            n = n - quotient;
        }
        return n;
    }
}
