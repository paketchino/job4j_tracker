package ru.job4j.streram;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(20, "Masha"));
        input.add(new Student(128, "Pety"));
        List<Student> excepted = List.of(
                new Student(20, "Masha"),
                new Student(128, "Pety")
        );
        assertThat(StudentLevel.levelOf(input, 20), is(excepted));
    }
}