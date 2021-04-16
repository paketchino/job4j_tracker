package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkDate(List<Integer> date) {
        boolean rsl = true;
        int sum = 0;
        for (int i = 1; i < date.size() - 1; i++) {
            if (date.get(i) != (date.get(i - 1) + date.get(i + 1)) / 2) {
                rsl = false;
                sum = 0;
            }
        }
        if (rsl) {
            for (Integer i : date) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
