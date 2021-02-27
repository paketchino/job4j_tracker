package ru.job4j.oop;

public class Main {
    public static void main(String[] args) {
        final User FIRST_USER = new User("Roman", 20);
        System.out.println("Вывод в консоль до изменения");
        System.out.println(FIRST_USER);

        FIRST_USER.setName("Roman Kulyanin");
        FIRST_USER.setAge(25);
        System.out.println("Вывод в консоль после изменений");
        System.out.println(FIRST_USER);
    }
}
