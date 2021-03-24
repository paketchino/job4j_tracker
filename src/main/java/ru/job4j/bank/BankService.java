package ru.job4j.bank;

import java.util.*;

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
        Optional<User> userPassport = findByPassport(passport);
        if (userPassport.isPresent()) {
            List<Account> userAccount = users.get(userPassport.get());
            if (!userAccount.contains(account)) {
                userAccount.add(account);
            }
        } else {
            System.out.println("Account added");
        }
    }

    /**
     * Метод выполняет поиск по ключу
     * @param passport входящие значение
     * @return возвращает найденного пользователся, если такой ключ имеется
     * то метод прекращает свое выполнение
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                    .stream()
                    .filter(u -> u.getPassport().equals(passport)).findFirst();
    }

    /**
     * Метод выполняет поиск по реквизитам
     * @param passport паспорт пользователя
     * @param requisite реквизиты пользователя
     * @return возвращает найденный аккаунт если паспорт
     * не равен null или если requisite равны
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> userPassport = findByPassport(passport);
        if (userPassport.isPresent()) {
            return users.get(userPassport.get())
                    .stream()
                    .filter(a -> a.getRequisites().equals(requisite)).findFirst();
        } else {
            return Optional.empty();
        }
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
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
