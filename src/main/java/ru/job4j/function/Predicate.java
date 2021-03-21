package ru.job4j.function;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
