package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items === ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.findAll();
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.replace(item.getId(),item);
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.deleted(item.getId());
            } else if (select == 4) {
                System.out.println("=== Find Item by Id ===");
                System.out.println("Enter id: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.findById(item.getId());
            } else  if (select == 5) {
                System.out.println("=== Find Items by Name ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.findByName(name);
            } else {
                System.out.println("Exit Program");
                break;
            }
        }
    }
    private void showMenu() {
        System.out.println("0. Add Items");
        System.out.println("1. Show all Items");
        System.out.println("2. Edit Item");
        System.out.println("3. Delete Item");
        System.out.println("4. Find Item by Id");
        System.out.println("5. Find Item by Name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
        Item item = new Item("I can`t take it  anymore");
        tracker.add(item);
        tracker.findAll();
    }
}

