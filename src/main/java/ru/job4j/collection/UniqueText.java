package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String originalText : origin) {
            check.add(originalText);
        }
        for (String dupliT: text) {
            if (check.contains(dupliT)) {
                rsl = true;
            }
        }

        return rsl;
    }
}
