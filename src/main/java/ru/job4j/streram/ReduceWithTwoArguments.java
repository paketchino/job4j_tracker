package ru.job4j.streram;

import java.util.List;

public class ReduceWithTwoArguments {
    public static Integer collect(List<Integer> list) {
        return list.stream().reduce(5,(x, y) -> (x * y));
    }
}
