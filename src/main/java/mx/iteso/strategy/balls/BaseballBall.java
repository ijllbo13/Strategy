package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.LongDrift;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BaseballBall extends Ball {

    public BaseballBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new NotDeflatable();
        aerialDriftBehavior = new LongDrift();
        type = "Baseball ball";
    }

}
