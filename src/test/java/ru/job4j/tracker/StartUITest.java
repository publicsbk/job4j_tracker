package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Item item = tracker.add(new Item("Replaced item"));
        String id = String.valueOf(item.getId());
        String edit = "New item name";
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", id, edit, "1"}
        );
        UserAction[] actions = {
                new EditAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Output out = new StubOutput();
        Item item = tracker.add(new Item("Deleted item"));
        String id = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[] {"0", id, "1"}
        );
        UserAction[] action = {
                new DeleteAction(),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, action);
        assertNull(tracker.findById(item.getId()));
    }

    @Test
    public void whenShowAllAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1"));
        String ln = System.lineSeparator();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] action = new UserAction[]{
                new ShowAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, action);
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit" + ln
                        + "=== Show all items ===" + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1"));
        String ln = System.lineSeparator();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] action = new UserAction[]{
                new FindByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, action);
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit" + ln
                        + "=== Find item by id ===" + ln
                        + item + ln
                        + "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenFindNameAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test1"));
        String ln = System.lineSeparator();
        Input in = new StubInput(
                new String[] {"0", item.getName(), "1"}
        );
        UserAction[] action = new UserAction[]{
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, action);
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Find item by name" + ln
                        + "1. Exit" + ln
                        + "=== Find items by name ===" + ln
                        + item + ln
                        + "Menu:" + ln
                        + "0. Find item by name" + ln
                        + "1. Exit" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenExit() {
        String ln = System.lineSeparator();
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Exit" + ln
                        + "=== Exit Program ===" + ln
        ));
    }
}