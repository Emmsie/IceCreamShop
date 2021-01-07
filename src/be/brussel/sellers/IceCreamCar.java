package be.brussel.sellers;

import be.brussel.eatables.Cone;
import be.brussel.eatables.IceRocket;
import be.brussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock){
        this.priceList = priceList;
        this.stock = stock;
        profit = 0.0;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavours) {
        if(flavours.length<=stock.getBalls() && stock.getCones()>0) {
            profit += 0.83*flavours.length * priceList.getBallPrice();
            return prepareCone(flavours);
        }
        return null;
    }

    private Cone prepareCone(Cone.Flavor[] flavours){
        stock.setBalls(stock.getBalls()-flavours.length);
        stock.setCones(stock.getCones()-1);
        return new Cone(flavours);
    }

    @Override
    public IceRocket orderIceRocket() {
        if(stock.getIceRockets()>0){
            profit += 0.83*priceList.getRocketPrice();
            return prepareRocket();
        }
        return null;
    }

    private IceRocket prepareRocket(){
        stock.setIceRockets(stock.getIceRockets()-1);
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        if(stock.getMagni()>0){
            profit += 0.83*priceList.getMagnumPrice(magnumType);
            return prepareMagnum(magnumType);
        }
        return null;
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType){
        stock.setMagni(stock.getMagni()-1);
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
