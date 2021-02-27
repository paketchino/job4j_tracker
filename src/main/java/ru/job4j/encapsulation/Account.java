package ru.job4j.encapsulation;

public class Account {
   private int balance;

   public Account(int balance) {
       this.balance = balance;
   }

    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}
