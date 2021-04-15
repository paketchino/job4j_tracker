package ru.job4j.samopoznanye;

public class SecondSum {
    public static int sum(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i++) {
            if (a == 0) {
                if (i % 2 == 0) {
                    if (b >= i) {
                        rsl = rsl + i;
                    }
                }
            }
            if (a != 0) {
                if (i % 2 != 0) {
                    if (b >= i) {
                        rsl = rsl + i;
                    }
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int sum = SecondSum.sum(0, 6);
        System.out.println(sum);
    }
}
