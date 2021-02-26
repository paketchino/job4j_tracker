package ru.job4j.collection;

import java.util.Comparator;

public class JobDescByPriority implements Comparator<Job> {
    @Override
    public int compare(Job a1, Job a2) {
        return Integer.compare(a2.getPriority(), a1.getPriority());
    }
}
