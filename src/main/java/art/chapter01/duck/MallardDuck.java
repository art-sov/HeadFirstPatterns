package art.chapter01.duck;

import art.chapter01.fly.FlyWithWings;
import art.chapter01.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm real mallard duck");
    }

}
