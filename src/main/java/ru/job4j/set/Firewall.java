package ru.job4j.set;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] stringCheck = s.split(" ");
        for (String i : stringCheck) {
            if (words.contains(i)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}
