package mx.iteso.strategy.behaviors;

public interface BounceBehavior {
    String CRASH =  "I crashed!! I can't bounce";
    String IRR_BOUNCE = "I'm bouncing irregularly!";
    String NOR_BOUNCE = "I'm bouncing normally!";
    String bounce();
}
