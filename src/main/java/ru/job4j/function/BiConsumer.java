package ru.job4j.function;
@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);
}
