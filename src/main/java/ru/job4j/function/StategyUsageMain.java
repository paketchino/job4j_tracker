package ru.job4j.function;

public class StategyUsageMain {
    public static void main(String[] args) {
        StrategyUsage strategyUsage = new StrategyUsage();
        System.out.println(
                "Result of work: " + strategyUsage.check(
                        str -> str.isEmpty(), ""
                )
        );
        System.out.println(
                "Result of work: " + strategyUsage.check(
                        str -> str.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Result of work: " + strategyUsage.check(
                        str -> str.contains("rn"), "Surname Name"
                )
        );
    }
}
