package ru.job4j.samopoznanye;

import java.util.*;

public class Article {
    /**
     * Method check origin text
     * @param origin origin text
     * @param line duplicate text
     * @return rsl if true or false
     */
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String or = origin.replaceAll("\\p{P}", "");
        String ln = line.replaceAll("\\p{P}", "");
        String[] originText = or.split(" ");
        String[] lineText = ln.split(" ");
        Set<String> hashSet = new HashSet<>();
        for (String o : originText) {
            hashSet.add(o);
        }
        for (String words : lineText) {
            if (!hashSet.contains(words)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
