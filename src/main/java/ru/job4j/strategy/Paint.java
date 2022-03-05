package ru.job4j.strategy;

public class Paint {

    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint triangle = new Paint();
        Paint square = new Paint();
        square.draw(new Square());
        triangle.draw(new Triangle());
    }
}
