package ru.job4j.function;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
