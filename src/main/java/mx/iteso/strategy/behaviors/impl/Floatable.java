package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationBehavior;

/**
 * Created by Jorge on 9/15/2016.
 */
public class Floatable implements FlotationBehavior {

    public String flotate(){
        return FLOATABLE_FLOAT;
    }

    public String sink(){ return FLOATABLE_SINK; }
}
