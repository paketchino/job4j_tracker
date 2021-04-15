package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
            String str = list.get(list.size() - 1);
            String element = list.get(list.lastIndexOf(str));
            list.remove(list.lastIndexOf(str));
            for (String s : list) {
            if (index < list.size()) {
                list.set(index, element);
                System.out.println(s);
            }
        }
        return list;
    }
}
