package ru.job4j.streram;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AveragingMethodTest {

    @Test
    public void averaging() {
        AveragingMethod.Company c1 = new AveragingMethod.Company("Amazon");
        AveragingMethod.Company c2 = new AveragingMethod.Company("Facebook");
        AveragingMethod.Company c3 = new AveragingMethod.Company("Google");

        AveragingMethod.Worker w1 = new AveragingMethod.Worker(30, c1);
        AveragingMethod.Worker w2 = new AveragingMethod.Worker(32, c1);
        AveragingMethod.Worker w3 = new AveragingMethod.Worker(20, c2);
        AveragingMethod.Worker w4 = new AveragingMethod.Worker(25, c2);
        AveragingMethod.Worker w5 = new AveragingMethod.Worker(50, c3);
        AveragingMethod.Worker w6 = new AveragingMethod.Worker(45, c3);

        Map<String, Double> except = Map.of(
                "Amazon", 31D,
                "Facebook", 22.5D,
                "Google", 47.5D
        );

        assertEquals(except, AveragingMethod.averaging(List.of(w1, w2, w3, w4, w5, w6)));
    }
}