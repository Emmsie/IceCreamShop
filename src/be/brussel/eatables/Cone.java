package be.brussel.eatables;

public class Cone implements Eatable{

    private Flavor[] balls;

    public Cone(){
        this(new Flavor[]{Flavor.VANILLA});
    }

    public Cone (Flavor[] flavours){
        balls = flavours;
    }

    @Override
    public void eat() {
        System.out.println(flavours());
    }

    private String flavours(){

        if(balls.length==1){
            return "You're eating a cone with one "+flavourName(balls[0])+" flavoured ball.";
        }

        StringBuilder flavours = new StringBuilder("");
        for (int i = 0; i< balls.length; i++){
            flavours.append(flavourName(balls[i]));
            if(i== balls.length-2){
                flavours.append(" and ");
            } else if(i!= balls.length-1){
                flavours.append(", ");
            }
        }
        return  "You're eating a cone with following flavoured balls: " +flavours +".";
    }

    private String flavourName(Flavor flavor){

        String flavour = "";
        switch (flavor){
            case STRAWBERRY:
                flavour = "strawberry";
                break;
            case BANANA:
                flavour = "banana";
                break;
            case CHOCOLATE:
                flavour = "chocolate";
                break;
            case VANILLA:
                flavour = "vanilla";
                break;
            case LEMON:
                flavour = "lemon";
                break;
            case STRACIATELLA:
                flavour = "straciatella";
                break;
            case MOKKA:
                flavour = "mokka";
                break;
            case PISTACHE:
                flavour = "pistache";
                break;
        }
        return flavour;
    }

    public enum Flavor{
        STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
    }
}
