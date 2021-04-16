package ru.job4j.example;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
            if (array[i] == 0) {
                count--;
            }
        }
        return count;
    }
}
