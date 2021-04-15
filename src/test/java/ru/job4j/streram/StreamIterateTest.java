package ru.job4j.streram;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StreamIterateTest {

    @Test
    public void showArray() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
       Integer[] data = {1, 2, 3, 4};
        StreamIterate.showArray(data);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("1" + ln + "3" + ln));
    }
}