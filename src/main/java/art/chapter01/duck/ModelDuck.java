package art.chapter01.duck;

import art.chapter01.fly.FlyNoWay;
import art.chapter01.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck!");
    }
}
