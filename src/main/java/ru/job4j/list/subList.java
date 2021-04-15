package ru.job4j.list;

import java.util.List;

public class subList {
    public static List<String> getElementBetweenIndexes(List<String> list, String el) {
            if (!list.contains(el)) {
                return list;
            } else if (list.contains(el)) {
                return list.subList(list.indexOf(el), list.lastIndexOf(el));
        }
        return list;
    }
}
