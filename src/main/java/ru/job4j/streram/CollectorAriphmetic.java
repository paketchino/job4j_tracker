package ru.job4j.streram;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorAriphmetic {
    public static Integer collect(List<Integer> list) {
        //сюда сложим элементы
        Supplier<List<Integer>> supplier = LinkedList::new;
        //говорим, как добавить элемент
        BiConsumer<List<Integer>,Integer> consumer = List::add;
        //просто нужно
        BinaryOperator<List<Integer>> merger = (xs, xy) -> {
            xs.addAll(xy);
            return xs;
        };
        // вся логика
        Function<List<Integer>, Integer> function = (ns) -> {
            int rsl = 1;
            for (Integer n : ns) {
                rsl = rsl * n;
            }
            return rsl;
        };
        return list.stream()
                .collect(Collector.of(
                        supplier,
                        consumer,
                        merger,
                        function
                ));
    }
}
