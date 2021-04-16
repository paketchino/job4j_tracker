package ru.job4j.example;

public class SwapRows {
    public static void swap(int[][] data, int src, int dest) {
        int[] temp = data[src];
        data[src] = data[dest];
        data[dest] = temp;
    }
}
