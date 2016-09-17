package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.MediumDrift;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Jorge on 9/14/2016.
 */
public class CrystalBall extends Ball{

    public CrystalBall() {
        bounceBehavior = new Crash();
        deflateBehavior = new NotDeflatable();
        aerialDriftBehavior = new MediumDrift();
        type = "Crystal ball";
    }

}
