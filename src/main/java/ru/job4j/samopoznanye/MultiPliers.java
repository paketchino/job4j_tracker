package ru.job4j.samopoznanye;

public class MultiPliers {
    public static void out(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
