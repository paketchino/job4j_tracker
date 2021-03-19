package ru.job4j.streram;

import org.junit.Test;

import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SchoolTest {
    @Test
    public void whenCollectClassA() {
        List<Student> list = List.of(
                new Student(40, "Surname1"),
                new Student(50, "Surname2"),
                new Student(60, "Surname3"),
                new Student(70, "Surname4"),
                new Student(80, "Surname5"),
                new Student(90, "Surname6"),
                new Student(100, "Surname7")
        );
        School school = new School();
        Predicate<Student> predicate = students -> students.getScore() >= 70 && students.getScore() <= 100;
        List<Student> rsl = school.collect(list, predicate);
        List<Student> excepted = new ArrayList<>();
        excepted.add(new Student(70, "Surname4"));
        excepted.add(new Student(80, "Surname5"));
        excepted.add(new Student(90, "Surname6"));
        excepted.add(new Student(100, "Surname7"));
        assertThat(rsl, is(excepted));
    }

    @Test
    public void whenCollectClassB() {
        List<Student> list = List.of(
                new Student(40, "Surname1"),
                new Student(50, "Surname2"),
                new Student(60, "Surname3"),
                new Student(70, "Surname4"),
                new Student(80, "Surname5"),
                new Student(90, "Surname6")
        );
        School school = new School();
        Predicate<Student> predicate = students -> students.getScore() >= 50 && students.getScore() < 70;
        List<Student> rsl = school.collect(list, predicate);
        List<Student> excepted = new ArrayList<>();
        excepted.add(new Student(50, "Surname2"));
        excepted.add(new Student(60, "Surname3"));
        assertThat(rsl, is(excepted));
    }

    @Test
    public void whenCollectClassC() {
        List<Student> list = List.of(
                new Student(10, "Surname1"),
                new Student(30, "Surname2"),
                new Student(40, "Surname3"),
                new Student(50, "Surname4"),
                new Student(80, "Surname5"),
                new Student(90, "Surname6"),
                new Student(100, "Surname7")
        );
        School school = new School();
        Predicate<Student> predicate = students -> students.getScore() > 0 && students.getScore() < 50;
        List<Student> rsl = school.collect(list, predicate);
        List<Student> excepted = new ArrayList<>();
        excepted.add(new Student(10, "Surname1"));
        excepted.add(new Student(30, "Surname2"));
        excepted.add(new Student(40, "Surname3"));
        assertThat(rsl, is(excepted));
    }
}