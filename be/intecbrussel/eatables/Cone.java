package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{

    private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    public enum Flavor{
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE
    }


    public Flavor[] getBalls() {
        return balls;
    }

    @Override
    public void eat() {
        System.out.println("eating cone with "+ Arrays.toString(this.balls));

    }
}
