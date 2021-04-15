package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {
        int rsl = -1;
        if (left.contains(str) && right.contains(str)) {
            left.remove(str);
            left.addAll(right);
            rsl = left.indexOf(str);
        } else if (left.contains(str)) {
            rsl = left.indexOf(str);
        } else if (right.contains(str)) {
            rsl = right.indexOf(str);
        }
        return rsl;
    }
}
