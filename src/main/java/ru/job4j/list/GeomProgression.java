package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int sum = 0;
        int num = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
              num = first * (int) Math.pow(denominator, i - 1);
              list.add(num);
        }
        for (Integer i : list) {
            sum = sum + i;

        }
        return sum;
    }
}
