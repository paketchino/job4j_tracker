package ru.job4j.tracker;


public class StartUI {
    public static void FindNameByItem(Input input, Tracker tracker) {
        System.out.println("=== Find Items by Name ===");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item.getName());
            }
        } else {
            System.out.println("Items with name not found");
        }
    }
    public static void FindItemById(Input input, Tracker tracker) {
        System.out.println("=== Find Item by Id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getId());
        } else {
            System.out.println("Item with id not found");
        }
    }
    public static void showAllItem(Input input, Tracker tracker) {
        System.out.println("=== Show all items === ");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        int id = input.askInt("Enter items for delete");
        if (tracker.deleted(id)) {
            System.out.println("Successful");
        } else {
            System.out.println("Not delete");
        }
    }
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        int id = input.askInt("Enter id");
        String name = input.askStr("Enter name");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.println("Successful");
        } else {
            System.out.println("Not correct");
        }
    }
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
               showAllItem(input, tracker);
            } else if (select == 2) {
                replaceItem(input, tracker);
            } else if (select == 3) {
             deleteItem(input, tracker);
            } else if (select == 4) {
              StartUI.FindItemById(input, tracker);
            } else  if (select == 5) {
               StartUI.FindNameByItem(input, tracker);
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
       Input input = new ConsoleInput();
       Tracker tracker = new Tracker();
       new StartUI().init(input, tracker);
    }
}

