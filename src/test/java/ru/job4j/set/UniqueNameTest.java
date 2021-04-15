package ru.job4j.set;

import org.junit.Test;
import ru.job4j.list.UniqueElement;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class UniqueNameTest {
    @Test
    public void checkUniqueName() {
        List<UniqueName.User> list = List.of(
                new UniqueName.User(1, "name1"),
                new UniqueName.User(2, "name2"),
                new UniqueName.User(3, "name1"),
                new UniqueName.User(4, "name3"),
                new UniqueName.User(5, "name5"),
                new UniqueName.User(6, "name3")
        );

        int rsl = UniqueName.collectUniqueName(list);
        assertThat(rsl, is(4));
    }

}