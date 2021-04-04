package ru.job4j.streram;

import ru.job4j.function.BiConsumer;
import ru.job4j.function.BinaryOperator;
import ru.job4j.function.Supplier;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public class CollectorClass {

    public static List<Integer> collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;
        BinaryOperator<List<Integer>> operator = (left, right) -> {
            left.addAll(right);
            return left;
        };
        return list.stream()
                .collect(Collector.of(
                        supplier,
                        biConsumer,
                        operator
                        )
                );
    }
}
