package ru.job4j.streram;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class StudentsTest {
    @Test
    public void whenConverterStudentsToMap() {
        Students student = new Students();
        Student student1 = new Student(1, "Roman");
        Student student2 = new Student(2, "Pavel");
        Student student3 = new Student(3, "Evgenya");
        Student student4 = new Student(6, "Petrov");
        Map<String, Student> rsl = student.collect(List.of(student1, student2, student3, student4));
        Map<String, Student> excepted = Map.of(
                "Roman", student1,
                "Pavel", student2,
                "Evgenya", student3,
                "Petrov", student4
        );
        assertThat(rsl, is(excepted));
    }

    @Test
    public void whenConverterStudentsCheckDuplicate() {
        Students student = new Students();
        Student st1 = new Student(1, "Roman");
        Student st2 = new Student(2, "Pavel");
        Student st3 = new Student(3, "Evgenya");
        Student st4 = new Student(1, "Roman");
        Map<String, Student> rsl = student.collect(List.of(st1, st2, st3, st4));
        Map<String, Student> excepted = Map.of(
                "Roman", st1,
                "Pavel", st2,
                "Evgenya", st3
        );
        assertThat(rsl, is(excepted));
    }
}