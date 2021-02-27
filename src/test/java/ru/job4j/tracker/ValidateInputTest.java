package ru.job4j.tracker;

import org.junit.Test;
//2
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ValidateInputTest {
    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalidMultiple() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "1", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalidNegative() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu :");
        assertThat(selected, is(-1));
    }
}