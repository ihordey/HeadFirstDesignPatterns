package headfirst.strategy.duck.model;

import headfirst.strategy.duck.behavior.fly.FlyNoWay;
import headfirst.strategy.duck.behavior.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
