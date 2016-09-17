package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationBehavior;

/**
 * Created by Jorge on 9/15/2016.
 */
public class Sinkable implements FlotationBehavior{
    public String flotate(){ return SINKABLE_FLOAT; }

    public String sink(){
        return UNSINKABLE_FLOAT;
    }
}
