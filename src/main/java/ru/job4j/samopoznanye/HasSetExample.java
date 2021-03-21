package ru.job4j.samopoznanye;

import java.util.HashSet;
import java.util.Set;

public class HasSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Oleg");
        set.add("Alexey");
        set.add("Marina");
        set.add("Roman");
        //System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }
        //System.out.println(set.isEmpty());
        //System.out.println(set.contains("Marina"));
    }
}
