package ru.job4j.lozna;

public class Subject {

    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
