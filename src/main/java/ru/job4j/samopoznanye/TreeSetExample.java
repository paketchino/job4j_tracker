package ru.job4j.samopoznanye;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student2> treeSet = new TreeSet<>();
        Student2 st1 = new Student2("Petya", 3);
        Student2 st2 = new Student2("Riman", 5);
        Student2 st3 = new Student2("Gondon", 67);
        Student2 st4 = new Student2("Roman", 2);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        System.out.println(treeSet);
        Student2 st5 = new Student2("Oleg", 2);
        Student2 st6 = new Student2("Ivan", 67);
        System.out.println(treeSet.subSet(st5, st6));
        System.out.println(st4.equals(st5));
    }
}

class Student2 implements Comparable<Student2> {
    private String name;
    private int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student2 student2 = (Student2) o;
        return course == student2.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return "Student2{"
                + "name='" + name + '\''
                + ", course=" + course
                + '}';
    }

    @Override
    public int compareTo(Student2 o) {
        return Integer.compare(course, o.course);
    }
}
