package ru.job4j.samopoznanye;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originText = origin.split(" ");
        String[] lineText = line.split(" ");
        Set<String> hashSet = new HashSet<>();
        for (String o: originText) {
            hashSet.add(o);
        }
        for (String words : lineText) {
            if (!hashSet.contains(words)) {
                rsl = false;
            }
        }
        return rsl;
    }
}
