package ru.job4j.function;

@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
}
