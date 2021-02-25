package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByNameLn implements Comparator<Job> {
    @Override
    public int compare(Job a1, Job a2) {
        return Integer.compare(a2.getName().length(), a1.getName().length());
    }
}
