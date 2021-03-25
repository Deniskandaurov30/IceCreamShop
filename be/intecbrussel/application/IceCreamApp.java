package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {

    public static void main(String[] args) {

        IceCreamSalon iceCreamSalon = new IceCreamSalon(new PriceList());
        Magnum magnum = new Magnum(Magnum.MagnumType.ALPINE_NUTS);
        IceRocket iceRocket = new IceRocket();
        Cone.Flavor []flavors= {Cone.Flavor.STRACIATELLA, Cone.Flavor.STRAWBERRY, Cone.Flavor.BANANA};
        Cone cone = new Cone(flavors);
        Eatable []eatables = {iceCreamSalon.orderCone(flavors), iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINE_NUTS),iceCreamSalon.orderIceRocket()};

        for (Eatable iceCream:eatables){
            iceCream.eat();
        }

        System.out.println(iceCreamSalon.getProfit());





    }
}
