package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {

    private int id;
    private String name;


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
    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}