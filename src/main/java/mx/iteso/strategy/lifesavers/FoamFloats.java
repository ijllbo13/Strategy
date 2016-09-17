package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Jorge on 9/15/2016.
 */
public class FoamFloats extends Lifesaver {
    public FoamFloats(){
        flotationBehavior = new Floatable();
        deflateBehavior = new NotDeflatable();
        type = "Foam Float";
    }
}
