package ru.job4j.samopoznanye;

public class test {
    public static void main(String[] args) {
        int[] myArray = {2, 4, 6};
        sum(myArray, 0);
    }

    //fact(4);
    // 4 * fact(3)
    // 3 * fact(2)
    // 2 * fact(1)
    // fact(1) return 1
    private static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    private static int sum(int[] array, int index) {
        if (array.length < 3) {
            return 0;
        }
        return array[index] + sum(array, array[index + 2 - 2]);
    }
}
