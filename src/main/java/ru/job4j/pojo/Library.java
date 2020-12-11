package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 350);
        Book javaProgram = new Book("Java Programing", 500);
        Book grammar = new Book("Grammar", 800);
        Book kotlin = new Book("Kotlin", 600);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = javaProgram;
        books[2] = grammar;
        books[3] = kotlin;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getNumberOfPages());
        }
        books[0] = kotlin;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " " + bk.getNumberOfPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(books[i])) {
                System.out.println(bk.getName() + " " + bk.getNumberOfPages());
            }
        }
    }
}
