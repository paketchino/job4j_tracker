package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("Ivan", "5614 242418", "eDer3432f"),
                new Account("Roman", "5462 31233", "fRtgt3457g")
        );
        HashSet<Account> except = new HashSet<>(
                Arrays.asList(
                        new Account("Ivan", "5614 242418", "eDer3432f"),
                        new Account("Roman", "5462 31233", "fRtgt3457g")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(except));
    }
    @Test
    public void checkDelete() {
        List<Account> accounts = Arrays.asList(
                new Account("Ivan", "5614 242418", "eDer3432f"),
                new Account("Roman", "5462 31233", "fRtgt3457g"),
                new Account("Roman", "5462 31233", "fRtgt3457g")
        );
        HashSet<Account> result = new HashSet<>(
                Arrays.asList(
                        new Account("Ivan", "5614 242418", "eDer3432f"),
                        new Account("Roman", "5462 31233", "fRtgt3457g"),
                        new Account("Roman", "5462 31233", "fRtgt3457g")
        )
        );
        HashSet<String> expected = new HashSet<>(
                Arrays.asList(
                    new Account("Ivan", "5614 242418", "eDer3432f"),
                    new Account("Roman", "5462 31233", "fRtgt3457g")
        ));
        assertThat(NotifyAccount.sent(result), is(expected));
    }
}