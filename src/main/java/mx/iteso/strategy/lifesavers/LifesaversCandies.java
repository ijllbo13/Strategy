package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Sinkable;

/**
 * Created by Jorge on 9/15/2016.
 */
public class LifesaversCandies extends Lifesaver {
    public LifesaversCandies(){
        flotationBehavior = new Sinkable();
        deflateBehavior = new NotDeflatable();
        type = "Lifesaver candy";
    }
}
