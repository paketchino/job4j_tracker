package ru.job4j.collection;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix Bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot Server", 1)
        );
        Collections.sort(jobs);
        System.out.println(jobs);
        Collections.sort(jobs, Collections.reverseOrder());
        System.out.println(jobs);


    }
}
