package be.brussel.application;

import be.brussel.eatables.Cone;
import be.brussel.eatables.Eatable;
import be.brussel.sellers.IceCreamSalon;
import be.brussel.sellers.IceCreamSeller;
import be.brussel.sellers.PriceList;

import static be.brussel.eatables.Cone.Flavor.*;
import static be.brussel.eatables.Magnum.MagnumType.BLACKCHOCOLATE;
import static be.brussel.eatables.Magnum.MagnumType.ROMANTICSTRAWBERRIES;


public class IceCreamSalonApp {
    public static void main(String[] args) {

        PriceList priceListSalonIceIceDarling = new PriceList(1.0, 2.3, 1.9);
        IceCreamSeller iceCreamSalonIceIceDarling = new IceCreamSalon(priceListSalonIceIceDarling);
        Eatable[] someEatableIceCreams = new Eatable[6];

        someEatableIceCreams[0] = iceCreamSalonIceIceDarling.orderIceRocket();
        someEatableIceCreams[1] = iceCreamSalonIceIceDarling.orderCone(new Cone.Flavor[]{STRAWBERRY, VANILLA, LEMON});
        someEatableIceCreams[2] = iceCreamSalonIceIceDarling.orderMagnum(BLACKCHOCOLATE);
        someEatableIceCreams[3] = iceCreamSalonIceIceDarling.orderMagnum(ROMANTICSTRAWBERRIES);
        someEatableIceCreams[4] = iceCreamSalonIceIceDarling.orderCone(new Cone.Flavor[]{MOKKA, MOKKA, MOKKA, STRACIATELLA});
        someEatableIceCreams[5] = iceCreamSalonIceIceDarling.orderCone(new Cone.Flavor[]{PISTACHE});

        for(Eatable iceCream : someEatableIceCreams){
            iceCream.eat();
        }

        System.out.println(iceCreamSalonIceIceDarling);

    }
}
