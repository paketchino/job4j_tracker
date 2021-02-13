package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void add(User user) {
        List<Account> accounts = new ArrayList<>();
        if (!users.containsKey(user)) {
            users.put(user, accounts);
        }
    }

    public void addAccount(String passport, String account) {

    }

    public void findByPassport(String passport) {
        for (User key : users.keySet()) {
            List value = users.get(key);
        }
        return ;
    }




}
