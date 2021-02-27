package ru.job4j.tracker;

import java.util.Scanner;
//2
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        System.out.println(askStr(question));
        return Integer.valueOf(askStr(question));
    }
}
