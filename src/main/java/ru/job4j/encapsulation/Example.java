package ru.job4j.encapsulation;

public class Example {
    private int a = 5, b =7;

    public int showResult() {
        return a+b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
