package headfirst.strategy.duck.model;

import headfirst.strategy.duck.behavior.fly.FlyNoWay;
import headfirst.strategy.duck.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
