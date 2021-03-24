package ru.job4j.bank;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
//
public class BankServiceTest {
    @Test
    public void addUser() {
        Optional<User> user = Optional.of(new User("3fgs", "Roman"));
        BankService bank = new BankService();
        bank.add(user.get());
        assertThat(bank.findByPassport("3fgs"), is(user));
    }

    @Test
    public void findByPassport() {
        Optional<User> user1 = Optional.of(new User("3fgs", "Roman"));
        Optional<User> user2 = Optional.of(new User("2344", "Evgen"));
        Optional<User> user3 = Optional.of(new User("3451", "Maksim"));
        BankService bankService = new BankService();
        bankService.add(user1.get());
        bankService.add(user2.get());
        bankService.add(user3.get());
        assertThat(bankService.findByPassport("3fgs"), is(user1));
    }

    @Test
    public void addAccount() {
        Optional<User> user1 = Optional.of(new User("3fgs", "Roman"));
        BankService bankService = new BankService();
        bankService.add(user1.get());
        bankService.addAccount(user1.get().getPassport(), new Account(150D, "5546"));
        assertThat(bankService.findByRequisite("3fgs", "5546").get().getBalance(), is(150D));
    }

    @Test
    public void whenInvalidPassport() {
        Optional<User> user1 = Optional.of(new User("3fgs", "Roman"));
        BankService bankService = new BankService();
        bankService.add(user1.get());
        bankService.addAccount(user1.get().getPassport(), new Account(150D, "5546"));
        assertThat(bankService.findByRequisite("3f", "5546"), is(Optional.empty()));
    }

    @Test
    public void add2Accounts() {
        Optional<User> user1 = Optional.of(new User("3fgs", "Roman"));
        BankService bankService = new BankService();
        bankService.add(user1.get());
        bankService.addAccount(user1.get().getPassport(), new Account(150D, "1111"));
        bankService.addAccount(user1.get().getPassport(), new Account(300D, "1222"));
        assertThat(bankService.findByRequisite("3fgs", "1222").get().getBalance(), is(300D));
    }

    @Test
    public void transferMoney() {
        Optional<User> user1 = Optional.of(new User("3fgs", "Roman"));
        BankService bankService = new BankService();
        bankService.add(user1.get());
        bankService.addAccount(user1.get().getPassport(), new Account(150D, "123"));
        bankService.addAccount(user1.get().getPassport(), new Account(50D, "4576"));
        bankService.transferMoney(user1.get().getPassport(), "123", user1.get().getPassport(), "4576", 150D);
        assertThat(bankService.findByRequisite(user1.get().getPassport(), "4576").get().getBalance(), is(200D));
    }

}