package be.brussel.sellers;

public class Stock {

    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;

    public int getIceRockets(){
        return this.iceRockets;
    }

    public void setIceRockets(int amount){
        if(getIceRockets()+amount>=0){
            iceRockets += amount;
        } else {
            iceRockets = 0;
        }
    }

    public int getCones(){
        return this.cones;
    }

    public void setCones(int amount){
        if(getCones()+amount>=0){
            cones += amount;
        } else {
            cones = 0;
        }
    }

    public int getBalls(){
        return this.balls;
    }

    public void setBalls(int amount){
        if(getBalls()+amount>=0){
            balls += amount;
        } else {
            balls = 0;
        }
    }

    public int getMagni(){
        return this.magni;
    }

    public void setMagni(int amount){
        if(getMagni()+amount>=0){
            magni += amount;
        } else {
            magni = 0;
        }
    }

}
