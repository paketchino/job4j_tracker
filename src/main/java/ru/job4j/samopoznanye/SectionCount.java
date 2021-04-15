package ru.job4j.samopoznanye;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length >= section) {
            length = length - section;
            count++;
        }
        return count;
    }
}
