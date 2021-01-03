package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public String name() {
        return "Find Item By Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getId());
        } else {
            System.out.println("Item with Id not found");
        }
        return true;
    }
}
