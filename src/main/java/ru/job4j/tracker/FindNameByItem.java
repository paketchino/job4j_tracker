package ru.job4j.tracker;

public class FindNameByItem implements UserAction {
    @Override
    public String name() {
        return "Find Name By Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter items");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
        for (Item item : items) {
            System.out.println(item.getName());
        }
        } else {
            System.out.println("Item with name not found");
        }
        return true;
    }
}
