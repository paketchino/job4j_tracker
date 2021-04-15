package ru.job4j.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        boolean rsl = false;
        String[] strings = s.split("");
        Set<String> stringSet = new HashSet<>();

        for (String i: strings) {
            stringSet.add(i);
        }
        stringSet.remove(" ");
        if (stringSet.size() == 26) {
            rsl = true;
        }
        return rsl;
    }
}
