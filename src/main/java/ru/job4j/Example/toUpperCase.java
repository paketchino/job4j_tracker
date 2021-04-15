package ru.job4j.Example;

public class toUpperCase {
    public static char[] toUpperCase(char[] string) {
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                string[i] = Character.toUpperCase(string[i]);
            }
        }
        return string;
    }
}
