package ru.job4j.oop;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is a type of transport which flies by air.");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel type of " + getClass().getSimpleName() + "s : jet fuel or gasoline.");
    }
}
