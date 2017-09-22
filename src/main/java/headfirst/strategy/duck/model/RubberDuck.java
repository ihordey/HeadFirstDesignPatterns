package headfirst.strategy.duck.model;

import headfirst.strategy.duck.behavior.fly.FlyNoWay;
import headfirst.strategy.duck.behavior.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
