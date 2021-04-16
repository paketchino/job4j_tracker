package ru.job4j.example;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            int ascii = (int) character;
            if (ascii >= 65 && ascii <= 90) {
                str.append(character);
            }
        }
        return str.toString();
    }
}
