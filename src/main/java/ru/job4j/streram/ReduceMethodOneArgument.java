package ru.job4j.streram;

import java.util.List;
import java.util.Optional;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        return list.stream().reduce((x, y) -> (x * y)).get();
    }
}
