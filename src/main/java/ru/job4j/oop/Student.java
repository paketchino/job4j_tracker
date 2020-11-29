package ru.job4j.oop;

public class Student {
    public void song() {
        System.out.println("I believe I can fly");
    }
    public void music() {
        System.out.println("tra tra tra");
    }
    public static void main(String[] args) {
        Student Petya = new Student();
        Petya.music();
        Petya.music();
        Petya.music();
        Petya.song();
        Petya.song();
        Petya.song();
    }
}
