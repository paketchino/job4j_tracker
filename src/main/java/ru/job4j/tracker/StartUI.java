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
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                System.out.println("Enter id");
                int id = scanner.nextInt();
                System.out.println("Enter name");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Successful");
                } else {
                    System.out.println("Not correct");
                }

            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.println("Enter items for delete");
                int id = scanner.nextInt();
                if (tracker.deleted(id)) {
                    System.out.println("Successful");
                } else {
                    System.out.println("Not delete");
                }

            } else if (select == 4) {
                System.out.println("=== Find Item by Id ===");
                System.out.println("Enter id: ");
                int id = scanner.nextInt();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.getId());
                } else {
                    System.out.println("Item with id not found");
                }
            } else  if (select == 5) {
                System.out.println("=== Find Items by Name ===");
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item.getName());
                    }
                } else {
                    System.out.println("Items with name not found");
                }
            } else  if (select == 6 ) {
                run = false;
            } else {
                System.out.println("There are no such numbers");
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
    }
}

