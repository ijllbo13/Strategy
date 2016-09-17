package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.ShortDrift;

/**
 * Created by Jorge on 9/14/2016.
 */
public class PingPongBall extends Ball{

    public PingPongBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        aerialDriftBehavior = new ShortDrift();
        type = "Ping Pong ball";
    }
    
}
