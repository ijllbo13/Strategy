package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.MediumDrift;

public class AmericanFootballBall extends Ball {

    public AmericanFootballBall() {
        bounceBehavior = new IrregularBounce();
        deflateBehavior = new Deflatable();
        aerialDriftBehavior = new MediumDrift();
        type = "American Football ball";
    }

}
