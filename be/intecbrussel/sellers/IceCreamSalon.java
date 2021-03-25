package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {

    public PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        if (flavors != null && flavors.length > 0) {
            totalProfit += priceList.getBallPrice() * flavors.length;

        } else {
            totalProfit += priceList.getBallPrice();
        }
        Cone cone = new Cone(flavors);
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        Magnum magnum = new Magnum(type);
        totalProfit += priceList.getMagnumPrice(type);
        return magnum;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
