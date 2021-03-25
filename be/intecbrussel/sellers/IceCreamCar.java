package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar {

    public PriceList priceList;
    public Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

//    public Cone orderCone(Cone.Flavor[]flavors){
//    }
//    public Cone prepareCone(Cone.Flavor[]flavors){
//    }
//    public IceRocket orderIceRocket(){
//    }
//    public IceRocket prepareIceRocket(){
//    }
//    public Magnum orderMagnum(Magnum.MagnumType){
//    }
//    public Magnum prepareMagnum(Magnum.MagnumType){
//    }

    public double getProfit() {
        return profit;
    }
}
