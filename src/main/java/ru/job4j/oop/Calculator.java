package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int rslt = sum(5);
        System.out.println(rslt);
        rslt = minus(11);
        System.out.println(rslt);
        Calculator rsl = new Calculator();
        System.out.println(rsl.multiply(6));
        System.out.println(rsl.divide(15));
        System.out.println(rsl.sumAllOperation(3));
    }
}
