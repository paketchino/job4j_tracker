package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

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
            out.println("Replace complete");
        } else {
            out.println("Not complete");
        }
        return true;
    }
}
