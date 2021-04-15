package ru.job4j.streram;

import java.util.List;
import java.util.stream.Stream;

public class TerminalMethod {
    public static void show(Stream<Integer> data)
    {
        data.forEach(System.out::println);
    }


    public static boolean check(List<String> list)
    {
        return list.stream().allMatch(n -> n.length() > 3);
    }

    public static boolean checkAnyMath(List<String> list)
    {
        return list.stream().anyMatch(n -> n.contains("job4j"));
    }

    public static boolean checkNoneAnyMatch(List<String> list)
    {
        return list.stream().noneMatch(n -> n.isEmpty());
    }
}
