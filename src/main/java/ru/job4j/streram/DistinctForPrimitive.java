package ru.job4j.streram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctForPrimitive {

    public static List<Integer> collect(int[] date)
    {
        return Arrays.stream(date)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }
}
