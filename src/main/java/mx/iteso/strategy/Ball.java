package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.AerialDriftBehavior;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

public abstract class Ball {

    public BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public AerialDriftBehavior aerialDriftBehavior;
    public String type;

    public Ball() {
    }


    public  void setBounceBehavior(int type){
        if (type == 1){
            this.bounceBehavior = new NormalBounce();
        }
        else if (type == 2){
            this.bounceBehavior = new IrregularBounce();
        }
        else if (type == 3){
            this.bounceBehavior = new Crash();
        }
        else
            System.out.println("Tipo de bounce no válido");
    }


    // Unused
    public BounceBehavior getBounceBehavior(Ball ball){
        return this.bounceBehavior;
    }



    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performAerialDrift() {
        return aerialDriftBehavior.drift();
    }

}
