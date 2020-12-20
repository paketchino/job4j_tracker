package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matchers {
    public static void main(String[] args) {
        int matchers = 11;
        boolean rsl = matchers > 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Количество спичек " + matchers);
        while (rsl) {
            matchers = matchers - Integer.valueOf(input.nextLine());
            if (matchers < 1) {
                System.out.println(matchers + " Не осталось");
                rsl = false;
            }
            System.out.println("На столе " + matchers + "спичкек");
        }
        System.out.println("Вы выйграли!");
    }
}
