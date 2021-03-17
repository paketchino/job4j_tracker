package ru.job4j.streram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name;
        private final long spent;

        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "name='" + name + '\'' +
                    ", spent=" + spent +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-2, -1 ,1, 2, 3, 5, 6, 7, 8
        );
        List<Integer> date = numbers.stream().filter(
                number -> number > 0
        ).collect(Collectors.toList());
        date.forEach(System.out::println);
    }
}
