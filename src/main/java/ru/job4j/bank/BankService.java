package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void add(User user) {
        List<Account> accounts = new ArrayList<>();
            users.putIfAbsent(user, accounts);
        }

    public void addAccount(String passport, Account account) {
        User userPassport = findByPassport(passport);
        if (userPassport != null) {
            List<Account> userAccount = users.get(userPassport);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }

        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User userPassport = findByPassport(passport);
        if (userPassport != null) {
            List<Account> userAccounts = users.get(userPassport);
            for (Account a : userAccounts) {
                if (a.getRequisites().equals(requisite)) {
                    account = a;
                }
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                 String destRequisite, double amount) {
        boolean rsl = false;
        Account destAccount = findByRequisite(destPassport, destRequisite);
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount && destAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(srcAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
