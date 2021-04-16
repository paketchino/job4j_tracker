package ru.job4j.streram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntMethod {
    public static long sum(List<Character> list) {
        return list.stream().mapToInt(u -> (int) u).sum();
    }

    public static List<Integer> boxed(int[] data) {
        return Arrays.stream(data)
                .boxed()
                .collect(Collectors.toList());
    }

    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }

    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream().flatMap(subList -> subList.stream()).collect(Collectors.toList());
    }

    public static List<Integer> filter(List<Integer> data) {
        return data.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public static List<String> filter2(List<String> data) {
        return data.stream()
                .filter(st -> st.startsWith("A"))
                .filter(st2 -> st2.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
