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
        Item item = tracker.add(new Item("Replaced Item"));
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
        public void WhenFindAll() {
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
                new String[] {"0",String.valueOf(item.getName()),"1"}
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
                       + "Find Name Action" + System.lineSeparator()
                       + "Menu." + System.lineSeparator()
                       + "0. Find Name Action" + System.lineSeparator()
                       + "1. Exit" + System.lineSeparator()

        ));
        }
        @Test
    public void FindIdAction(){
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find Id Action"));
        Input in = new StubInput(
                new String[] {"0",String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new FindIdAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker,actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Id Action" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. Find Id Action" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
        ));
        }

    }