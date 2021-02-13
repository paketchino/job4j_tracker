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
       List< Order> result = new ArrayList<>();
       result.add(new Order("3fse", "Dress"));
       HashMap<String, Order> map = OrderConvert.process(result);
       assertThat(map.get("3fse"), is(new Order("3fse" ,"Dress")));
    }
}