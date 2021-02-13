package ru.job4j.bank;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BankServiceTest {
    @Test
    public void addUser() {
        User user = new User("3fgs", "Roman");
        BankService bank = new BankService();
        bank.add(user);
        assertThat(bank.findByPassport("3fgs"), is(user));

    }

    @Test
    public void findByPassport() {
        User user1 = new User("3fgs", "Roman");
        User user2 = new User("2344", "Evgen");
        User user3 = new User("3451", "Maksim");
        BankService bankService = new BankService();
        bankService.add(user1);
        bankService.add(user2);
        bankService.add(user3);
        assertThat(bankService.findByPassport("3fgs"), is(user1));
    }
}