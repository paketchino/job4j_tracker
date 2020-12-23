package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

 public class Matchers {
     public static void main(String[] args) {
         boolean player = true;
         Scanner input = new Scanner(System.in);
         int matches = 11;
         System.out.println("Добро пожаловать в игру " + matches + " спичек");
         while (matches > 0) {
             String name = player ? "Player First" : "Player Second";
             System.out.println(name + " выберите количество спичек от 1 до 3");
             int count = Integer.valueOf(input.nextLine());
             matches -= count;
             if (matches > 0) {
                 player = !player;
                 System.out.println("На столе осталось " + matches);
             }
             if (matches == 0) {
                 System.out.println("Выйграл игрок " + name);
             }
         }
     }
 }
