package ru.job4j.streram;

import java.util.Objects;

public class Student {
    private int score;

    private String username;

    public Student(int score, String username) {
        this.score = score;
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                Objects.equals(username, student.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, username);
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", username='" + username + '\'' +
                '}';
    }
}
