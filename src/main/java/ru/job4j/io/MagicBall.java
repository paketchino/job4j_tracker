package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракал. Что ты хочешь узнать?");
        int answer = new Random().nextInt(3);
        String name = input.nextLine();

        if (answer == 0) {
            System.out.println("yes");
        } else if (answer == 1) {
            System.out.println("net");
        } else {
            System.out.println("mb");
        }
    }
}
