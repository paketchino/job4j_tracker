package ru.job4j.streram;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Students {
    Map<String, Student> collect(List<Student> students) {
        return students
                .stream()
                .collect(Collectors.toMap(Student::getUsername, s -> s, (e, r) -> e));
    }
}
