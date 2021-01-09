package ru.job4j.ex;

public class FactRex {
    public static int calc(int n) {
        int rsl = 1;
        if (n == 0 || n == 1) {
            return rsl;
        } else {
            rsl = calc(n - 1 ) * n;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
