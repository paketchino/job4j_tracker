package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

 public class Matchers {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             int matches = 11;
             boolean player = true;
             boolean rls = matches > 0;
             System.out.println("Welcome to game Play 11");
             while (rls) {
                 String name = player ? "Player1" : "Player2";
                 System.out.println("Выберите количество спичек" + name);
                 int select = Integer.valueOf(scanner.nextLine());
                 if (select < 1 || select > 3) {
                     System.out.println("You enter error number");
                 } else {
                     matches -= select;
                     player = !player;
                 }
                 System.out.println("Matches " + matches + " on the table");
                 if (matches < 1) {
                     System.out.println(name + "win");
                     break;
                 }
             }
         }
     }

