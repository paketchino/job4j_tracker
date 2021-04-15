package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        boolean rsl = false;
        String[] strings = s.split("");
        Set<String> stringSet = new HashSet<>();
        for (String i : strings) {
            stringSet.add(i);
        }
        if (strings.length == stringSet.size()) {
            rsl = true;
        }
        return rsl;
    }
}
