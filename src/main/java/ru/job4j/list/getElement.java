package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class getElement {
    public static String getElement(List<String> list) {
        String rsl = "";
        for (String s : list) {
            if (!s.isEmpty()) {
                rsl = list.get(0);
            }
        }
        return rsl;
    }
}
