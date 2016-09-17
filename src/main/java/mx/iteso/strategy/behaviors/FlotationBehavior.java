package mx.iteso.strategy.behaviors;

/**
 * Created by Jorge on 9/15/2016.
 */
public interface FlotationBehavior {
    String FLOATABLE_FLOAT = "I'm floating!";
    String FLOATABLE_SINK = "I can't sink!";
    String SINKABLE_FLOAT = "I can't float!";
    String UNSINKABLE_FLOAT = "I'm sinking!";
    String flotate();
    String sink();
}
