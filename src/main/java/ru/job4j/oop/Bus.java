package ru.job4j.oop;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is a type of transport using roads and highways.");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel type of " + getClass().getSimpleName() + "es : diesel, hybrid or electric.");
    }
}
