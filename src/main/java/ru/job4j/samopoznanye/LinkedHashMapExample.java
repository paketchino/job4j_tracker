package ru.job4j.samopoznanye;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Roman", "Kulyanin", 3);
        Student st2 = new Student("Maksim", "Ragozshkin", 2);
        Student st3 = new Student("Evgenyi", "Nadeev", 1);
        Student st4 = new Student("Petr", "Arsentiev", 4);

        lhm.put(7.5, st1);
        lhm.put(5.5, st2);
        lhm.put(8.5, st3);
        lhm.put(1.5, st4);
        System.out.println(lhm);

        System.out.println(lhm.get(5.5));
        System.out.println(lhm.get(7.5));

        System.out.println(lhm);
    }
}
