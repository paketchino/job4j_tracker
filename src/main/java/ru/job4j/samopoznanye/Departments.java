package ru.job4j.samopoznanye;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String joiner = String.join("", value);
            for (String el : value.split("\"")) {
                tmp.add(joiner + "/" + el);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs)   {
        orgs.sort(new SortByDesc());
    }
}
