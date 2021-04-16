package ru.job4j.example;

public class SwapCols {
    public static void swap(int[][] data, int src, int dest) {
        for (int i = 0; i < data.length; i++) {
            int temp = data[i][src];
            data[i][src] = data[i][dest];
            data[i][dest] = temp;
        }
    }
}
