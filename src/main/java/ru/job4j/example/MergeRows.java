package ru.job4j.example;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] rsl = new int[data.length * data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                rsl[count] = data[i][j];
                count++;
            }
        }
        return rsl;
    }
}
