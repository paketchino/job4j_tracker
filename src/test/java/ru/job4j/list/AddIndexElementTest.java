package ru.job4j.list;

import org.junit.Test;
import ru.job4j.list.AddIndexElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class AddIndexElementTest {

    @Test
    public void addNewElement() {
        List<String> list = new ArrayList<>();
        list.add("Fish");
        list.add("Sugar");
        list.add("Apple");
        boolean result = AddIndexElement.addNewElement(list, 1, "Oil");
        assertThat(result, is(true));
    }
}