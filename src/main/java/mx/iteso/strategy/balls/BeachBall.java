package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.ShortDrift;

/**
 * Created by Jorge on 9/14/2016.
 */
public class BeachBall extends Ball{

    public BeachBall(){
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        aerialDriftBehavior = new ShortDrift();
        type = "Beach ball";
    }

}
