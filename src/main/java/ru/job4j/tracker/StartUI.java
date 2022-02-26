package ru.job4j.tracker;

import ru.job4j.Item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item itemOne = new Item();
        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(itemOne.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
        Item itemTwo = new Item("Item Two", 2);
        System.out.println(itemTwo);
    }
}
