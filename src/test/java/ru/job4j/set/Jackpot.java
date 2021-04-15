package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        boolean rsl = true;
        Set<String> stringSet = new HashSet<>();
        for (String s : combination) {
            stringSet.add(s);
        }
        if (stringSet.size() != 1) {
            rsl = false;
        }
        return rsl;
    }
}
