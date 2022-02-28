package ru.job4j.oop;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is a type of transport using rails.");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel type of " + getClass().getSimpleName() + "s : diesel or electric.");
    }
}
