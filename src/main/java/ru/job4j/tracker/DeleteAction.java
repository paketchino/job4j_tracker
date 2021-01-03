package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter items for delete");
        boolean rsl = tracker.deleted(id);
        if (rsl) {
            System.out.println("Successful");
        } else
            System.out.println("Not successful");
        return true;
    }
}
