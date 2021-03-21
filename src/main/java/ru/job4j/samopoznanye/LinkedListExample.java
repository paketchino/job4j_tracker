package ru.job4j.samopoznanye;

import ru.job4j.oop.Student;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student1 st1 = new Student1("Roman", 5);
        Student1 st2 = new Student1("Alexey", 3);
        Student1 st3 = new Student1("Elena", 2);
        Student1 st4 = new Student1("Misha", 3);
        Student1 st5 = new Student1("Valinteen", 1);
        LinkedList<Student1> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        Student1 st6 = new Student1("Sasha", 3);
        Student1 st7 = new Student1("Roman", 5);
        studentLinkedList.add(st7);
        System.out.println("LinkedList = " + studentLinkedList);
        studentLinkedList.add(3, st6);
        System.out.println("LinkedList = " + studentLinkedList);
        System.out.println(studentLinkedList.get(0));
        for (Student1 s : studentLinkedList) {
            System.out.println(s);

        }
    }
}

    class Student1 {
        private String name;
        private int course;

        public Student1(String name, int course) {
            this.name = name;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{"
                    + "name='" + name + '\''
                    + ", course=" + course
                    + '}';
        }
    }
