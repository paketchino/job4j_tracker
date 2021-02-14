package ru.job4j.List;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str){
        List<String> check = new ArrayList<>(list);
        boolean rsl = false;
        if (!list.contains(str)) {
            list.add(index, str);
            if (list.size() != check.size()) {
                rsl = true;
            }
        }
        return rsl;
    }
}
