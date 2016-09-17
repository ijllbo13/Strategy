package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.MediumDrift;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by Jorge on 9/14/2016.
 */
public class BasketBallBall extends Ball {

    public BasketBallBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        aerialDriftBehavior = new MediumDrift();
        type = "BasketBall ball";
    }

}
