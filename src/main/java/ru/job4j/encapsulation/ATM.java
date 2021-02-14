package ru.job4j.encapsulation;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10);

        account.addMoney(100);
        account.addMoney(50);
    }
}
