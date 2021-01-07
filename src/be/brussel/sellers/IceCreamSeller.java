package be.brussel.sellers;

import be.brussel.eatables.Cone;
import be.brussel.eatables.IceRocket;
import be.brussel.eatables.Magnum;


public interface IceCreamSeller extends Profitable {

    Cone orderCone(Cone.Flavor[] flavours);

    IceRocket orderIceRocket();

    Magnum orderMagnum(Magnum.MagnumType magnumType);

}
