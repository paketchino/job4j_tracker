package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

 public class Matchers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matchers = 11;
        boolean rsl = matchers > 1;
        while (rsl) {
            System.out.println("Количество спичек: " + matchers);
            int firstPlayer = Integer.valueOf(input.nextLine());
            matchers =- firstPlayer;
            System.out.println("Matchers left" + matchers);
            if (matchers < 1) {
                System.out.println("First player win" + firstPlayer);
                break;
            }
            int secondPlayer = Integer.valueOf(input.nextLine());
            matchers =- secondPlayer;
            System.out.println("Matchers left " + matchers);
            if (matchers < 1) {
                System.out.println("Second player win " + secondPlayer);
                break;
            }
        }
    }
}
