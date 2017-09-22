package headfirst.strategy.duck.model;

import headfirst.strategy.duck.behavior.fly.FlyWithWings;
import headfirst.strategy.duck.behavior.quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
