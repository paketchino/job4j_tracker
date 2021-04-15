package ru.job4j.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;

public class ExampleStream {
    public static void main(String[] args) {
        List<String> beginningWithNumbers = Stream.of("a", "labc", "abcl")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(Collectors.toList());


        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(number -> number.stream())
                .collect(Collectors.toList());
    }

    class Artist {
        String name;

        public String getName() {
            return name;
        }
    }
}
