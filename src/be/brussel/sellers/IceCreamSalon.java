package be.brussel.sellers;

import be.brussel.eatables.Cone;
import be.brussel.eatables.IceRocket;
import be.brussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{

    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(PriceList priceList){
        this.priceList = priceList;
        totalProfit = 0.0;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavours) {
        totalProfit += 0.80*priceList.getBallPrice()*flavours.length;
        return new Cone(flavours);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += 0.80*priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        totalProfit += 0.80*priceList.getMagnumPrice(magnumType);
        return new Magnum(magnumType);
    }

    @Override
    public String toString() {
        return "The profit for the ice cream seller is: " + getProfit()+" creamy monetary units.";
    }
}
