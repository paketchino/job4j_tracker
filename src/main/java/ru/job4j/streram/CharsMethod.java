package ru.job4j.streram;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharsMethod {
    public static List<Character> symbols(String string) {
        return string.chars().mapToObj(s -> (char) s).collect(Collectors.toList());
    }
}
