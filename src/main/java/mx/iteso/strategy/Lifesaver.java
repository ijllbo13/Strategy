package mx.iteso.strategy;


import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;

public abstract class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public String type;
    public FlotationBehavior flotationBehavior;

    public String performDeflate() {
        return deflateBehavior.deflate();
    }
    public String performInflate() {
        return deflateBehavior.inflate();
    }
    public String performFlotation() { return flotationBehavior.flotate();}
    public String performSink(){ return flotationBehavior.sink();}

    public String display() {
        return "I'm a " + type;
    }
}
