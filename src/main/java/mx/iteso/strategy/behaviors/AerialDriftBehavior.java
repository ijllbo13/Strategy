package mx.iteso.strategy.behaviors;

/**
 * Created by Jorge on 9/14/2016.
 */
public interface AerialDriftBehavior {
    String LONGDRIFT = "I'm flying really far!";
    String MEDIUMDRIFT = "I'm flying a normal distance!";
    String SHORTDRIFT = "I'm flying a short distance!";
    String drift();
}
