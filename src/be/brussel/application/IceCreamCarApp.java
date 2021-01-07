package be.brussel.application;

import be.brussel.eatables.Cone;
import be.brussel.eatables.Eatable;
import be.brussel.sellers.IceCreamCar;
import be.brussel.sellers.IceCreamSeller;
import be.brussel.sellers.PriceList;
import be.brussel.sellers.Stock;

import static be.brussel.eatables.Cone.Flavor.*;
import static be.brussel.eatables.Magnum.MagnumType.*;

public class IceCreamCarApp {
    public static void main(String[] args) {

        PriceList priceListCarHoneyHoney = new PriceList(1.1, 2.4, 2.0);
        Stock stockHoneyHoney = new Stock();
        IceCreamSeller iceCreamCarHoneyHoney = new IceCreamCar(priceListCarHoneyHoney, stockHoneyHoney);
        Eatable[] someOtherEatableIceCreams = new Eatable[8];

        stockHoneyHoney.setCones(5);
        stockHoneyHoney.setBalls(50000);
        stockHoneyHoney.setMagni(30);
        stockHoneyHoney.setIceRockets(3);

        someOtherEatableIceCreams[0] = iceCreamCarHoneyHoney.orderIceRocket();
        someOtherEatableIceCreams[1] = iceCreamCarHoneyHoney.orderIceRocket();
        someOtherEatableIceCreams[2] = iceCreamCarHoneyHoney.orderCone(new Cone.Flavor[]{BANANA, STRAWBERRY, VANILLA, LEMON, LEMON});
        someOtherEatableIceCreams[3] = iceCreamCarHoneyHoney.orderMagnum(ROMANTICSTRAWBERRIES);
        someOtherEatableIceCreams[4] = iceCreamCarHoneyHoney.orderMagnum(ALPINENUTS);
        someOtherEatableIceCreams[5] = iceCreamCarHoneyHoney.orderCone(new Cone.Flavor[]{MOKKA, MOKKA, MOKKA, STRACIATELLA});
        someOtherEatableIceCreams[6] = iceCreamCarHoneyHoney.orderMagnum(BLACKCHOCOLATE);
        someOtherEatableIceCreams[7] = iceCreamCarHoneyHoney.orderCone(new Cone.Flavor[]{PISTACHE});


        for(Eatable iceCream : someOtherEatableIceCreams){
            if(iceCream==null){
                System.out.println("There is no more ice cream !!");
            } else {
                iceCream.eat();
            }
        }

        System.out.println("The profit for the ice cream seller is: " + iceCreamCarHoneyHoney.getProfit()+" creamy monetary units.");
    }

}
