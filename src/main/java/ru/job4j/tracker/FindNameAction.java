package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find Name Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                out.println(item.getName());
            }
        } else {
            out.println("Item with name not found");
        }
        return true;
    }
}
