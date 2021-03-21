package ru.job4j.samopoznanye;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(8);
        hashSet.add(1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet<Integer> intersect = new HashSet<>(hashSet);
        intersect.addAll(hashSet2);
        System.out.println(intersect);
    }
}
