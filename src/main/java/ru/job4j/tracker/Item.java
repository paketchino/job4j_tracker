package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

public class Item {

    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item(LocalDateTime created) {
        this.created = created;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return new StringJoiner(", " , Item.class.getSimpleName() + "[" , "]")
                .add("id= " + id)
                .add("name=' " + name + "'")
                .toString();
    }
}
