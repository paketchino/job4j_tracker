package ru.job4j.Example;

public class RightDiagonal {
    public static int[] diagonal(int[][] data)
    {
        int[] rsl = new int[data.length];
        for (int i = 0; i < data.length; i++) {
             rsl[i] = data[i][data.length - 1 - i];
        }
        return rsl;
    }
}
