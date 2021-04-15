package ru.job4j.list;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class getElementTest {
    @Test
    public void whenGetNull() {
    List<String> list = new ArrayList<>();
    String result = getElement.getElement(list);
    String expected = "";
    assertThat(result, is(expected));
}

    @Test
    public void whenGetFirstElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = getElement.getElement(list);
        String expected = "first";
        assertThat(result, is(expected));
    }


}