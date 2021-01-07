package be.brussel.eatables;

public class Magnum implements Eatable{

    private MagnumType type;

    public Magnum(){
        this(MagnumType.MILKCHOCOLATE);
    }

    public Magnum(MagnumType magnumType){
        type = magnumType;
    }

    @Override
    public void eat() {
        System.out.println(flavour());
    }

    public MagnumType getType() {
        return type;
    }

    private String flavour(){
        String flavour = "";

        switch (getType()){
            case MILKCHOCOLATE:
                flavour = "milk chocolate";
                break;
            case WHITECHOCOLATE:
                 flavour = "white chocolate";
                 break;
            case BLACKCHOCOLATE:
                 flavour = "dark chocolate";
                 break;
            case ALPINENUTS:
                 flavour = "alpine nuts";
                 break;
            case ROMANTICSTRAWBERRIES:
                 flavour = "romantic-strawberries";
                 break;
        }
        return  "You're eating a magnum with " + flavour+" flavour.";
    }

    public enum MagnumType{
        MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES;
    }

}
