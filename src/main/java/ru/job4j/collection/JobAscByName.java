package ru.job4j.collection;

import java.util.Comparator;

public class JobAscByName implements Comparator<Job> {
    @Override
    public int compare(Job a1, Job a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
