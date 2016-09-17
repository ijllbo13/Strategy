package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Floatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Jorge on 9/15/2016.
 */
public class SwimBelts extends Lifesaver {
    public SwimBelts(){
        flotationBehavior = new Floatable();
        deflateBehavior = new NotDeflatable();
        type = "Swimming Belt";
    }
}
