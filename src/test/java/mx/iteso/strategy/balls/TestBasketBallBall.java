package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 15/09/2016.
 */
public class TestBasketBallBall {

    private BasketBallBall basketBallBall;

    private String NOR_BOUNCE = "I'm bouncing normally!";
    private String DEFLATE = "I'm deflating!";
    private String INFLATE = "I'm inflating!";
    private String MEDIUMDRIFT = "I'm flying a normal distance!";

    @Before
    public void setUp(){
        basketBallBall = new BasketBallBall();
    }


    @Test
    public void testBasketBallBall() {
        assertEquals(NOR_BOUNCE, basketBallBall.performBounce());
        assertEquals(DEFLATE, basketBallBall.performDeflate());
        assertEquals(INFLATE, basketBallBall.performInflate());
        assertEquals(MEDIUMDRIFT, basketBallBall.performAerialDrift());
        assertEquals("BasketBall ball is rolling!", basketBallBall.roll());
    }


}
