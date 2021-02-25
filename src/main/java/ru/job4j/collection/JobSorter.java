package ru.job4j.collection;


import java.util.Arrays;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix Bugs", 1),
                new Job("Fix Bugs", 4),
                new Job("Fix Bugs", 2),
                new Job("X task", 0)
        );

        System.out.println(jobs);
    }
}
