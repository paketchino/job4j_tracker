package ru.job4j.encapsulation;

public class Config {
    private String name;
    private int position;
    private String properties;


    public Config(String name, int position, String properties) {
        this.name = name;
        this.position = position;
        this.properties = properties;
    }
    public void print() {
        System.out.println(position);
    }

     public String getProperty() {
        return search(properties);
    }


    public String search(String key) {
        return key;
    }
}
