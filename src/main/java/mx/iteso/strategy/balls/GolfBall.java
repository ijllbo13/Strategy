package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.LongDrift;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Jorge on 9/14/2016.
 */
public class GolfBall extends Ball{

    public GolfBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        aerialDriftBehavior = new LongDrift();
        type = "Golf ball";
    }

}
