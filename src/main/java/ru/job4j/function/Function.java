package ru.job4j.function;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
