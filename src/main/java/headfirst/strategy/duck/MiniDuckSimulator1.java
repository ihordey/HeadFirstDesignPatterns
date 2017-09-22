package headfirst.strategy.duck;

import headfirst.strategy.duck.behavior.fly.FlyRocketPowered;
import headfirst.strategy.duck.model.Duck;
import headfirst.strategy.duck.model.MallardDuck;
import headfirst.strategy.duck.model.ModelDuck;

public class MiniDuckSimulator1 {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
