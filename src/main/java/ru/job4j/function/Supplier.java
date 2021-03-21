package ru.job4j.function;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}
