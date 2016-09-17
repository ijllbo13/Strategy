package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

public class NotDeflatable  implements DeflateBehavior{
    public String deflate() {
        return NOTDEF_DEFLATE;
    }

    public String inflate() {
        return NOTDEF_INFLATE;
    }
}
