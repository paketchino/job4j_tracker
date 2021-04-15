package ru.job4j.samopoznanye;

public class OddCount {
    public static int count(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
               rsl++;
            }
        }
        return rsl;
    }
}
