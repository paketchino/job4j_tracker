package ru.job4j.function;

import ru.job4j.tracker.StubOutput;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FunctionInterfaceUsage {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "New String for Interface";
        System.out.println(sup.get());
        System.out.println("---------");

        List<String> list = List.of("one",  "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier = () -> new HashSet<>(list);
        Set<String> stringSet = supplier.get();
        for (String s : stringSet) {
            System.out.println(s);
        }
        System.out.println("---------");

        Supplier<String> supplier1 = () -> "New String for Interface";
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(supplier1.get());
        System.out.println("---------");

        Supplier<String> stringSupplier = () -> "New String for Interface";
        BiConsumer<String, String> consumer1 = (s, s1) -> System.out.println(s + s1);
        consumer1.accept(stringSupplier.get(), "and Second String");
        List<String> list1 = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier2 = () -> new HashSet<>(list1);
        BiConsumer<Integer, String> consumer2 = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = supplier2.get();
        int i = 1;
        for (String s: strings) {
            consumer2.accept(i++, " is " + s);
        }
        System.out.println("---------");

        Predicate<String> pred = s -> s.isEmpty();
        System.out.println("String is empty: " + pred.test(""));
        System.out.println("String is empty: " + pred.test("String isn`t empty"));

        Function<String, Character> function = s -> s.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));
        System.out.println("---------");

        BiFunction<String, Integer, String> biFunction =
                (s, i1) -> s.concat(" ").concat(i1.toString());
        System.out.println("Результат работы бифункции: " + biFunction.apply("Name", 123));
        System.out.println("Результат работы бифункции: " + biFunction.apply("String number", 56));
        System.out.println("---------");

        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка поле реверса: "
                + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка поле реверса: "
                + builder.apply(new StringBuilder("tset rof gnirtS")));
        System.out.println("---------");

        BinaryOperator<StringBuilder> builder1 = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println(
                "String before joiner: " + builder1.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }
}
