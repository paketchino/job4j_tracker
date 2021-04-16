package ru.job4j.streram;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingMethod {

    public static class User {
        private String name;

        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {

        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private Bill bill;
        private User user;

        public Pair(Bill bill, User user) {
            this.bill = bill;
            this.user = user;
        }

        public Bill getBill() {
            return bill;
        }

        public User getUser() {
            return user;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getName,
                        Collectors
                                .summingInt(balance -> balance.getBills()
                                .stream()
                                .mapToInt(Bill::getBalance)
                                                .sum()
                                )));
    }
}
