package ru.job4j.streram;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class levelOfExample {
    public List<Student> levelOf(List<Student> students, int bound) {
        return students
                .stream()
                .flatMap(t -> Stream.ofNullable(t))
                .sorted()
                .filter(student -> student.getScore() > bound)
                .collect(Collectors.toList());
    }
}
