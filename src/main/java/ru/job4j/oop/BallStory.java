package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        GrandDadMum grandDadMum = new GrandDadMum();
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.tryRun(grandDadMum);
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.eat(ball);
    }
}
