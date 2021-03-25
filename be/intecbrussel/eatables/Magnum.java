package be.intecbrussel.eatables;

public class Magnum implements Eatable{

    private MagnumType type;

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public Magnum() {
    }

    public enum MagnumType{
        MILK_CHOCOLATE,
        WHITE_CHOCOLATE,
        BLACK_CHOCOLATE,
        ALPINE_NUTS,
        ROMANTIC_STRAWBERRIES
    }



    @Override
    public void eat() {
        System.out.println("eating magnum " +type);
    }

    public MagnumType getType() {
        return type;
    }
}
