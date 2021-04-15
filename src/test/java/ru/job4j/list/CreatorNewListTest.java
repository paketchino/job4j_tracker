package ru.job4j.list;

import org.junit.Test;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CreatorNewListTest {
    @Test
    public void whenCheckList() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        CreatorNewList.main(null);
        String ln = System.lineSeparator();
        String excepted = "Создаем список с пустым конструктором." + ln
                + "Добавляем 3 элемента в список" + ln
                + "Создаем список - в конструктор передаем коллекцию." + ln
                + "Выводим все элементы в списке." + ln
                + "one" + ln + "two" + ln + "three" + ln;
        assertThat(out.toString(), is(excepted));
    }
}