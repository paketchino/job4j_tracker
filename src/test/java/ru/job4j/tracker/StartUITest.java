package ru.job4j.tracker;

import org.junit.Test;
import java.util.Scanner;

import static org.hamcrest.Matchers.sameInstance;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.nullValue;

public class StartUITest {

    @Test
    public void whenAddItem() {
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Item name"));
        UserAction[] actions = {
                new CreateAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenNeedDeleteItem() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted Item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenNeedReplaceItem() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("New item name"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replaceName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "New item name", "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replaceName));
    }

    @Test
    public void WhenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAll() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new FindAllAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Show All Action" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Show All Action" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()

        ));
    }

    @Test
    public void FindByNameAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find Name Action"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindNameAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Name Action" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "Item with name not found" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Name Action" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void FindIdAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find Id Action"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindIdAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Id Action" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Id Action" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                )
        ));

    }

    @Test
    public void whenInvalidAdd() {
        Output output = new StubOutput();
        Input input = new StubInput(
                new String[]{"10", "10","0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(output),
                new FindAllAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "1. Show All Action%n"
                )
        ));
    }
    @Test
    public void whenInvalidFindByName() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item =  tracker.add(new Item("Invalid Find By Name"));
        Input input = new StubInput(
                new String[] {"10",String.valueOf(item.getId()), "10", "0"}
        );
        UserAction[] actions = {
                new Exit(output),
                new FindNameAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "1. Find Name Action%n"
        )
        ));
    }

    @Test
    public void whenInvalidFindById() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find by Id"));
        Input input = new StubInput(
                new String[] {"10",String.valueOf(item.getId()),"10","0"}
        );
        UserAction[] actions = {
                new Exit(output),
                new FindIdAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                String.format(  "Menu.%n"
                        + "0. Exit%n"
                        + "1. Find Id Action%n"
                )
        ));
    }
    @Test
    public void whenInvalidReplace(){
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced Item"));
        Input input = new StubInput(
                new String[] {"10", String.valueOf(item.getId()), "10", "0"}
        );
        UserAction[] actions = {
                new Exit(output),
                new ReplaceAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                String.format("Menu.%n"
                        + "0. Exit%n"
                        + "1. === Edit Items ===%n"
                        + "Wrong input, you can select: 0 .. 1%n"
                        + "Menu.%n"
                        + "0. Exit%n"
                        + "1. === Edit Items ===%n"
                )
        ));
    }
    @Test
    public void whenInvalidShow() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("ShowAll"));
        Input input = new StubInput(
                new String[]{"10",String.valueOf(item.getId()), "10", "0"}
        );
        UserAction[] actions = {
                new Exit(output),
                new FindAllAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "1. Show All Action%n"
                        + "Wrong input, you can select: 0 .. 1%n"
                        + "Menu.%n"
                        + "0. Exit%n"
                        + "1. Show All Action%n"
                        + "Wrong input, you can select: 0 .. 1%n"
                        + "Menu.%n"
                        + "0. Exit%n"
                        + "1. Show All Action%n"
                )
        ));
    }
    @Test
    public void whenInvalidDelete() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Delete Item"));
        Input input = new StubInput(
                new String[] {"10", String.valueOf(item.getId()),"10", "0"}
        );
        UserAction[] actions = {
                new Exit(output),
                new DeleteAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString(), is(
                String.format(
                        "Menu.%n"
                        + "0. Exit%n"
                        + "1. === Delete Item ===%n"
                        + "Wrong input, you can select: 0 .. 1%n"
                        + "Menu.%n"
                                + "0. Exit%n"
                        + "1. === Delete Item ===%n"
                        + "Not successful%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                        + "1. === Delete Item ===%n"
                )
        ));
    }
    }
