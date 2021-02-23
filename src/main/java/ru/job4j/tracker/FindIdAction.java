package ru.job4j.tracker;
//

public class FindIdAction implements UserAction {
    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Id Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(tracker.findById(id));
        } else {
            out.println("Item with Id not found");
        }
        return true;
    }
}
