package ru.job4j.samopoznanye;

public class LogicAnd {
    public static boolean check(int num) {
        boolean rsl = false;
        if (num > 0 && num % 2 == 0) {
            rsl = true;
        }
        return rsl;
    }
    }
