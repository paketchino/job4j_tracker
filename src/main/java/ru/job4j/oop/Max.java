package ru.job4j.oop;

public class Max {
    public double max(double first, double second) {
        return first > second ? first : second;
    }

    public double max(double first, double second, double third) {
        return max(first,
                max(second, third)
        );
    }

    public double max(double first, double second, double third, double fourth) {
        return  max(first,
                max(second, third, fourth)
        );
    }

    public static void main(String[] args) {
        Max maxToFirst = new Max();
        Max maxToThird = new Max();
        double a = maxToFirst.max(5, 3, 2);
        System.out.println(a);
        double b = maxToThird.max(1, 3, 8, 2);
        System.out.println(b);
    }
}
