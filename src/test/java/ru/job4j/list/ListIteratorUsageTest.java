package ru.job4j.list;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

public class ListIteratorUsageTest {
    @Test
    public void checkUsageListIterator() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        ListIteratorUsage.main(null);
        String ln = System.lineSeparator();
        String excepted = "Start iterate..." + ln
                + "one" + ln + "two" + ln + "three" + ln
                + "Change direction iterate..." + ln
                + "three" + ln + "two" + ln + "one" + ln
                + "Finish iterate..." + ln;
        assertThat(out.toString(), is(excepted));
    }
}