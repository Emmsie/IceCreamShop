package be.brussel.sellers;

import be.brussel.eatables.Magnum;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList(){
        this(0,0,0);
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice){
        setBallPrice(ballPrice);
        setRocketPrice(rocketPrice);
        setMagnumStandardPrice(magnumStandardPrice);
    }

    public void setBallPrice(double ballPrice){
        if(ballPrice>0){
            this.ballPrice = ballPrice;
        }
    }

    public void setRocketPrice(double rocketPrice){
        if(rocketPrice>0){
            this.rocketPrice = rocketPrice;
        }
    }

    public void setMagnumStandardPrice(double magnumStandardPrice){
        if(magnumStandardPrice>0){
            this.magnumStandardPrice = magnumStandardPrice;
        }
    }

    public double getBallPrice() {
        return this.ballPrice;
    }

    public double getRocketPrice() {
        return this.rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType){

        double multiplier = 1.0;

        switch (magnumType.name()){
            case "MILKCHOCOLATE":
                multiplier = 2.0;
                break;
            case "WHITECHOCOLATE":
                multiplier = 0.9;
                break;
            case "BLACKCHOCOLATE":
                multiplier = 3.6;
                break;
            case "ALPINENUTES":
                multiplier = 1.5;
                break;
            case "ROMANTICSTRAWBERRIES":
                multiplier = 2.4;
                break;
        }
        return multiplier*this.magnumStandardPrice;
    }


}
