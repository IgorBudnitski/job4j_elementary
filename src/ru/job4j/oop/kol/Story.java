package ru.job4j.oop.kol;

public class Story {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.eat(ball);
        wolf.eat(ball);
        fox.eat(ball);
        ball.run(ball);

    }
}
