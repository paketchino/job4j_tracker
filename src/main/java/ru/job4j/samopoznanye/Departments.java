package ru.job4j.samopoznanye;

import java.util.*;

public class Departments {
    /**
     * Метод разделяет исходную строку с помощью split()
     * а потом из полученных частей собирает новую стороку с применением StringJoiner
     * @param deps исходная строка
     * @return возвращает собранную исходную строку
     */
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                } else {
                    start = String.join("/", value);
                }
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    /**
     *Метод производит сортивроку по принципу naturalOrder
     * @param orgs сортируемый список
     */
    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    /**
     * Метод производит сортировку по убыванию
     * сначало сравнивает первые элементы по убыванию, если они равны,
     * то сравнить последующие элементы, но в возрастающем порядке
     * @param orgs сортируемый список
     */
    public static void sortDesc(List<String> orgs)   {
        orgs.sort(new DepDescComp());
    }
}
