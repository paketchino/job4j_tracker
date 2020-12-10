package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book clean_code = new Book("Clean code", 350);
        Book java_program = new Book("Java Programing", 500);
        Book grammar = new Book("Grammar", 800);
        Book kotlin = new Book("kotlin", 600);
        Book[] books = new Book[4];
        books[0] = clean_code;
        books[1] = java_program;
        books[2] = grammar;
        books[3] = kotlin;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getNumberOfPages());
        }
        books[0] = kotlin;
        books[3] = clean_code;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getNumberOfPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("clean_code".equals(books[i])) {
                System.out.println(bk.getName() + " " + bk.getNumberOfPages());
            }
        }
    }
}
