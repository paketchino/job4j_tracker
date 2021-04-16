package ru.job4j.streram;

import org.junit.Test;

import static org.junit.Assert.*;

import ru.job4j.streram.OptinalStream;

import java.util.List;
import java.util.stream.Collectors;

public class OptinalStreamTest {

    @Test
    public void collectNmber() {
        OptinalStream.PhoneNumber ph1 = new OptinalStream.PhoneNumber("+7 123 345 61 91");
        OptinalStream.PhoneNumber ph2 = new OptinalStream.PhoneNumber("+7 123 345 61 91");
        OptinalStream.PhoneNumber ph3 = new OptinalStream.PhoneNumber("+7 123 345 61 91");
        OptinalStream.PhoneNumber ph4 = new OptinalStream.PhoneNumber("+7 123 345 61 91");
        OptinalStream.PhoneNumber ph5 = new OptinalStream.PhoneNumber("+2 123 345 61 91");

        OptinalStream.User us1 = new OptinalStream.User(4, List.of(ph1, ph2, ph3, ph4));
        OptinalStream.User us2 = new OptinalStream.User(1, List.of(ph5));
        assertEquals("+7 123 345 61 91",
                OptinalStream.collectNmber(List.of(us1, us2), 4, "+7")
                        .get(0).getPhone());
    }

    @Test
    public void test2() {
        OptinalStream.PhoneNumber ph1 = new OptinalStream.PhoneNumber("+7 123 345 61 91");
        OptinalStream.PhoneNumber ph2 = new OptinalStream.PhoneNumber("+7 123 345 61 92");
        OptinalStream.PhoneNumber ph3 = new OptinalStream.PhoneNumber("+7 123 345 61 93");
        OptinalStream.PhoneNumber ph4 = new OptinalStream.PhoneNumber("+1 123 345 61 91");
        OptinalStream.PhoneNumber ph5 = new OptinalStream.PhoneNumber("+2 123 345 61 91");
        OptinalStream.PhoneNumber ph6 = new OptinalStream.PhoneNumber("+3 123 345 61 91");
        OptinalStream.User u1 = new OptinalStream.User(1, List.of(ph1));
        OptinalStream.User u2 = new OptinalStream.User(2, List.of(ph2));
        OptinalStream.User u3 = new OptinalStream.User(3, List.of(ph2, ph3, ph4, ph5));
        OptinalStream.User u4 = new OptinalStream.User(3, List.of(ph6));
        assertEquals(
                List.of(ph2.getPhone(), ph3.getPhone()),
                OptinalStream.collectNmber(List.of(u1, u2, u3, u4), 3, "+7").stream()
                        .map(OptinalStream.PhoneNumber::getPhone).collect(Collectors.toList())
        );
    }
}