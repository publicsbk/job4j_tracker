package ru.job4j;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] arr = new Item[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                arr[counter] = items[i];
                counter++;
            }
        }
        arr = Arrays.copyOf(arr, counter);
        return arr;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
           item.setId(id);
           items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Item item1 = new Item("Error", 1598);
        Item item2 = new Item("Insert", 5221);
        Item item3 = new Item("Access", 1874);
        Item item4 = new Item("Buba", 1874);
        Tracker tracker = new Tracker();
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.findById(2);
        System.out.println(tracker.findAll().length);
        for (int i = 0; i < tracker.size; i++) {
            System.out.println(tracker.findAll()[i].getName() + tracker.findAll()[i].getId());
        }
        System.out.println();
        tracker.replace(2, item4);
        for (int i = 0; i < tracker.size; i++) {
            System.out.println(tracker.findAll()[i].getName() + tracker.findAll()[i].getId());
        }
        System.out.println();
    }

}