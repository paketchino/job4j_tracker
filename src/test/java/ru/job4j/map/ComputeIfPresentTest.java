package ru.job4j.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class ComputeIfPresentTest {
    @Test
    public void checkComputeIfPresent() {
        Map<Integer, String> name = new HashMap<>(Map.of(
                1, "Roman",
                2, "Maksim"
        ));
        Map<Integer, String> surname = new HashMap<>(Map.of(
           1, "Kulyanin",
           2, "Biba"
        ));
        Map<Integer, String> rsl = ComputeIfPresent.collectDate(name, surname);
        Map<Integer, String> excepted = Map.of(
                1, "Roman Kulyanin",
                2, "Maksim Biba"
        );
        assertThat(rsl, is(excepted));
    }
}