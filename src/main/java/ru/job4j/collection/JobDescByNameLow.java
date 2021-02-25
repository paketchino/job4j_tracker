package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByNameLow implements Comparator<Job> {
    @Override
    public int compare(Job a1, Job a2) {
        return a2.getName().compareTo(a1.getName());
    }
}
