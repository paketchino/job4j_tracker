package ru.job4j.collection;

import java.util.Objects;

public class Account {

    private String username;
    private String passport;
    private String deposit;

    public Account(String username, String passport, String deposit) {
        this.username = username;
        this.passport = passport;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, passport, deposit);
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + passport + '\'' +
                ", deposit='" + deposit + '\'' +
                '}';
    }
}
