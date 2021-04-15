package ru.job4j.streram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return Stream.iterate(it, Iterator::hasNext, x -> x)
                .flatMap(iterator -> Stream.iterate(iterator.next(), Iterator::hasNext, x -> x))
                .map(Iterator::next)
                .collect(Collectors.toList());
    }
}
