package ru.job4j.samopoznanye;

import java.util.Comparator;

public class DepDescComp  implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String o1First = o1.split("/")[0];
        String o2Second = o2.split("/")[0];
        if (o2Second.equals(o1First)) {
            return o1.compareTo(o2);
        }
        return o2Second.compareTo(o1First);
    }
}
