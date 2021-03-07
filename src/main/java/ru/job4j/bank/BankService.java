package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Метод описывают работу банковского сервиса
 * добавление пользователя, создание аккаунта,
 * поиск по паспорту, по реквизитам, а также перевод денег      
 * @author Roman Kulyanin
 * @version 1.0
 */

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод который добавляет пользователя
     * @param user добавленный пользователь
     */
    public void add(User user) {
        List<Account> accounts = new ArrayList<>();
            users.putIfAbsent(user, accounts);
        }

    /**
     * Метод добавляет аккаунт
     * @param passport добавляет значение паспорт
     * @param account добавляет значение аккаунт
     */
    public void addAccount(String passport, Account account) {
        User userPassport = findByPassport(passport);
        if (userPassport != null) {
            List<Account> userAccount = users.get(userPassport);
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        }
    }

    /**
     * Метод выполняет поиск по ключу
     * @param passport входящие значение
     * @return возвращает найденного пользователся, если такой ключ имеется
     * то метод прекращает свое выполнение
     */
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

    /**
     * Метод выполняет поиск по реквизитам
     * @param passport паспорт пользователя
     * @param requisite реквизиты пользователя
     * @return возвращает найденный аккаунт если паспорт
     * не равен null или если requisite равны
     */
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

    /**
     * Метод выполняет перевод денег с одного акк на другой
     * @param srcPassport паспорт 1-ого пользователя
     * @param srcRequisite реквизиты 1-ого пользователся
     * @param destPassport паспорт 2-ого пользователя
     * @param destRequisite реквизиты 2-ого пользователся
     * @param amount значение суммы которое нужно перевести
     * @return возвращает true если srcAccount, destAccount, баланс srcAccount != null
     * во всех остальных случаях возвращает false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                                 String destRequisite, double amount) {
        boolean rsl = false;
        Account destAccount = findByRequisite(destPassport, destRequisite);
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
