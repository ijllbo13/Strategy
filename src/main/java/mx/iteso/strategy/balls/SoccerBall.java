package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.MediumDrift;
import mx.iteso.strategy.behaviors.impl.*;

public class SoccerBall extends Ball {
    public SoccerBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new Deflatable();
        aerialDriftBehavior = new MediumDrift();
        type = "Soccer ball";
    }
}
