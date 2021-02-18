package ru.job4j.tracker;

import java.time.LocalDateTime;

import java.util.Comparator;
import java.util.Objects;
import java.util.StringJoiner;

public class Item implements Comparator<Item>   {

    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return new StringJoiner(", " , Item.class.getSimpleName() + "[" , "]")
                .add("id= " + id)
                .add("name=' " + name + "'")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compare(Item o, Item j) {
        return o.getName().compareTo(j.getName());
    }
}
