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
    @Test
    public void addAccount() {
        User user = new User("3fgs", "Roman");
        BankService bankService = new BankService();
        bankService.add(user);
        bankService.addAccount(user.getPassport(), new Account(150D, "5546"));
        assertThat(bankService.findByRequisite("3fgs", "5546").getBalance(), is(150D));
    }
    @Test
    public void whenInvalidPassport() {
        User user = new User("3fgs", "Roman");
        BankService bankService = new BankService();
        bankService.add(user);
        bankService.addAccount(user.getPassport(), new Account(150D, "5546"));
        assertNull(bankService.findByRequisite("3f", "5546"));
    }
    @Test
    public void add2Accounts() {
        User user = new User("3fgs", "Roman");
        BankService bankService = new BankService();
        bankService.addAccount(user.getPassport(), new Account(150D,"1111"));
        bankService.addAccount(user.getPassport(), new Account(300D, "1222"));
        assertThat(bankService.findByRequisite("3fgs", "1222"), is(300D));
    }
    @Test
    public void transferMoney() {
        User user = new User("3fgs", "Roman");
        BankService bankService = new BankService();
        bankService.add(user);
        bankService.addAccount(user.getPassport(), new Account(150D, "123"));
        bankService.addAccount(user.getPassport(),new Account(50D, "4576"));
        bankService.transferMoney(user.getPassport(), "123", user.getPassport(), "123",150D);
        assertThat(bankService.findByRequisite(user.getPassport(), "123").getBalance(), is(200D));
    }

}