package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit Items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id");
        String name = input.askStr("Enter name");
        Item newItem = new Item(name);
        boolean rsl = tracker.replace(id, newItem);
        if (rsl) {
            System.out.println("Replace complete");
        } else {
            System.out.println("Not complete");
        }
        return true;
    }
}
