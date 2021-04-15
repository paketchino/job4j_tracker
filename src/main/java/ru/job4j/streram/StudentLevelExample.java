package ru.job4j.streram;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLevelExample {
    public List<Student> levelOf(List<Student> students, int bound) {
        return students
                .stream()
                .flatMap(student -> Stream.ofNullable(student))
                .sorted()
                .filter(student -> student.getScore() > bound)
                .collect(Collectors.toList());
    }
}
