package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

public class Deflatable implements DeflateBehavior {

    public String deflate() {
        return DEF_DEFLATE;
    }

    public String inflate() {
        return DEF_INFLATE;
    }
}
