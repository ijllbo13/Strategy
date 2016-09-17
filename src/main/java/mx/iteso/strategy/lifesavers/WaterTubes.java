package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatable;

/**
 * Created by Jorge on 9/15/2016.
 */
public class WaterTubes extends Lifesaver{
    public WaterTubes(){
        flotationBehavior = new Floatable();
        deflateBehavior = new Deflatable();
        type = "Water Tube";
    }
}
