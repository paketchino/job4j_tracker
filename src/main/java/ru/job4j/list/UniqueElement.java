package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        int index = list.indexOf(str);
        int indexLast = list.lastIndexOf(str);
        if (!list.contains(str)) {
            return false;
        }
        return index == indexLast;
    }
}
