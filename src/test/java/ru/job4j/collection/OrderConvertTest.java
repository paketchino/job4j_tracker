package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class OrderConvertTest {

    @Test
    public void process() {
            List<Order> orders = new ArrayList<>();
            orders.add(new Order("Dress", "3sfe"));
            HashMap<String, Order> map = OrderConvert.process(orders);
            assertThat(map.get("3sfe"), is(new Order("Dress", "3sfe")));
    }
}