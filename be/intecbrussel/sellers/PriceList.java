package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {

    private double ballPrice= 1.00;
    private double rocketPrice= 1.25;
    private double magnumStandardPrice= 1.50;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        if (type== Magnum.MagnumType.ALPINE_NUTS){
            setMagnumStandardPrice(1.5*magnumStandardPrice);
        }
        return magnumStandardPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
