package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Show All Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item>items = tracker.findAll();
        for (Item item : items) {
            out.println(item.getName());
        }
        return true;
    }
}
