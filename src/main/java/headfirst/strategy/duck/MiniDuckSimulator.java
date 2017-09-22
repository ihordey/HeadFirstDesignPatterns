package headfirst.strategy.duck;

import headfirst.strategy.duck.behavior.fly.FlyRocketPowered;
import headfirst.strategy.duck.model.DecoyDuck;
import headfirst.strategy.duck.model.MallardDuck;
import headfirst.strategy.duck.model.ModelDuck;
import headfirst.strategy.duck.model.RubberDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubber = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubber.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
