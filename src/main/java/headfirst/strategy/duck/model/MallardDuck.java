package headfirst.strategy.duck.model;

import headfirst.strategy.duck.behavior.fly.FlyWithWings;
import headfirst.strategy.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
