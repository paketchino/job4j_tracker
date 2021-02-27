package ru.job4j.io;

import java.util.Scanner;

public class NumberMatchers {

    private int matchers;

    public NumberMatchers(int matchers) {
        this.matchers = matchers;
    }

    public int getMatchers() {
        return matchers;
    }

    public void setMatchers(int matchers) {
        this.matchers = matchers;
    }

    public NumberMatchers numberMatchers(int matchers) {
        Scanner input = new Scanner(System.in);
        matchers -= Integer.valueOf(input.nextLine());
        return numberMatchers(11);
    }
}
