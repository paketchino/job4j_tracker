package ru.job4j.example;

public class IndezOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
              count++;
            }
            if (count == number) {
                return i;
            }
        }
        return rsl;
    }
}
