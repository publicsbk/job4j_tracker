package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Wolf volk = new Wolf();
        Hare zayac = new Hare();
        Fox lisa = new Fox();
        volk.tryEat(kolobok);
        zayac.tryEat(kolobok);
        lisa.tryEat(kolobok);
    }
}
