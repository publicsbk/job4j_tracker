package ru.job4j.poly;

public class Bus implements Transport {

    private static final double FUEL_PRICE = 52.5;

    @Override
    public void ride() {
        System.out.println("Bus rides!");
    }

    @Override
    public void passengersCount(int count) {
        System.out.println("The number of passengers is: " + count);
    }

    @Override
    public double refuel(double fuelCount) {
        return FUEL_PRICE * fuelCount;
    }
}
