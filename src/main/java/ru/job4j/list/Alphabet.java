package ru.job4j.list;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        String[] s1 = s.split("");
        List<String> rsl = new ArrayList<>(Arrays.asList(s1));
        Collections.sort(rsl);
        String s2 = String.join("", rsl);
        return s2;
    }
}
