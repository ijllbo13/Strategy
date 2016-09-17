package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Floatable;

public class ArmBands extends Lifesaver{
    public ArmBands() {
        flotationBehavior = new Floatable();
        deflateBehavior = new Deflatable();
        type = "Arm bands";
    }

}
