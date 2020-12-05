package ru.job4j.oop;

public class Max {
    public double max(double first, double second, double third) {
        double result = (first > second ? first : second);
        return result > third ? result : third;
    }

    public double max(double first, double second, double third, double fourth) {
        double rsl = (Math.max(first, second));
        double result = rsl > third ? rsl : third;
        double total = Math.max(result, fourth);
        return total;
    }

    public static void main(String[] args) {
        Max maxToFirst = new Max();
        Max maxToThird = new Max();
        double a = maxToFirst.max(5, 3,2);
        System.out.println(a);
        double b = maxToThird.max(1, 2, 6, 2);
        System.out.println(b);
    }
}
