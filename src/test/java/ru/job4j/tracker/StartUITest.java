package ru.job4j.tracker;

import org.junit.Test;

import java.util.List;

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
        List<UserAction> actions = List.of(
                new CreateAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll().get(0).getName(), is("Item name"));
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
        List<UserAction> actions = List.of(
                new EditAction(out),
                new ExitAction(out)
        );
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
        List<UserAction> action = List.of(
                new DeleteAction(out),
                new ExitAction(out)
        );
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
        List<UserAction> action = List.of(
                new ShowAllAction(out),
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, action);
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit" + ln
                        + "=== Show all items ===" + ln
                        + item + ln
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
        List<UserAction> action = List.of(
                new FindByIdAction(out),
                new ExitAction(out)
        );
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
        List<UserAction> action = List.of(
                new FindByNameAction(out),
                new ExitAction(out)
        );
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
        List<UserAction> actions = List.of(
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Exit" + ln
                        + "=== Exit Program ===" + ln
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"7", "0"}
        );
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new ExitAction(out)
        );
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                        "Menu:" + ln
                                + "0. Exit" + ln
                                + "Wrong input, you can select: 0 .. 0" + ln
                                + "Menu:" + ln
                                + "0. Exit" + ln
                                + "=== Exit Program ===" + ln

                )
        );
    }

}