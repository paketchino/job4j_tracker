package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

 public class Matchers {
     public static void main(String[] args) {
         boolean player = true;
         Scanner input = new Scanner(System.in);
         int matches = 11;
         System.out.println("You play in the game 11");
         while (matches > 0) {
             String name = player ? "First Player" : "Second Player";
             System.out.println("Enter a number from 1 to 3: " + name);
             int select = Integer.valueOf(input.nextLine());
             if (select < 1 || select > 3) {
                 System.out.println("You enter error number");
                 break;
             } else {
                 matches -= select;
             }
             System.out.println("Matches " + matches + " on the table");
             player = !player;
             if (matches < 1) {
                 System.out.println(name + " win");
                 break;
                 }
             }
         }
     }

