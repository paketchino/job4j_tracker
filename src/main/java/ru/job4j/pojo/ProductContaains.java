package ru.job4j.pojo;

public class ProductContaains {
    public static void main(String[] args) {
        Product first = new Product("Milk",2);
        Product second = new Product("Milk", 2);
        boolean eq = first.equals(second);
        System.out.println(eq);
    }
}
