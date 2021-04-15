package ru.job4j.streram;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamMethod {

    public static Stream<Integer> createStream(Integer[] data) {
        return Arrays.stream(data);
    }
}
