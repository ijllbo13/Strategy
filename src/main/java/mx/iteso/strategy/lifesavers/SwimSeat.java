package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatable;

public class SwimSeat extends Lifesaver {
    public SwimSeat() {
        flotationBehavior = new Floatable();
        deflateBehavior = new Deflatable();
        type = "Swimming seat";
    }
}
