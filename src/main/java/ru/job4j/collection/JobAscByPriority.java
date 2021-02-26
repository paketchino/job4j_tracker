package ru.job4j.collection;

import java.util.Comparator;

public class JobAscByPriority implements Comparator<Job> {
    @Override
    public int compare(Job a1, Job a2) {
        return Integer.compare(a1.getPriority(), a2.getPriority());
    }
}
