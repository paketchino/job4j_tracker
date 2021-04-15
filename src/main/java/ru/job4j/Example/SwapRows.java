package ru.job4j.Example;

public class SwapRows {
    public static void swap(int[][] data, int src, int dest)
    {
        int[] temp = data[src];
        data[src] = data[dest];
        data[dest] = temp;
    }
}
