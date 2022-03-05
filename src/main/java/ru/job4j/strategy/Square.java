package ru.job4j.strategy;

public class Square implements Shape {

    @Override
    public String draw() {
        String ln =  System.lineSeparator();
        return    " _ _ _ " + ln
                + "|     |" + ln
                + "| _ _ |" + ln;
    }
}
