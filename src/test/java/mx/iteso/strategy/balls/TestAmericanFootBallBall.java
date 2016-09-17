package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 15/09/2016.
 */
public class TestAmericanFootBallBall {


    private AmericanFootballBall americanFootballBall;

    private String IRR_BOUNCE = "I'm bouncing irregularly!";
    private String DEFLATE = "I'm deflating!";
    private String INFLATE = "I'm inflating!";
    private String MEDIUMDRIFT = "I'm flying a normal distance!";


    @Before
    public void setUp(){
        americanFootballBall = new AmericanFootballBall();
    }

    @Test
    public void testAmericanFootballBall() {
        assertEquals(IRR_BOUNCE, americanFootballBall.performBounce());
        assertEquals(DEFLATE, americanFootballBall.performDeflate());
        assertEquals(INFLATE, americanFootballBall.performInflate());
        assertEquals(MEDIUMDRIFT, americanFootballBall.performAerialDrift());
        assertEquals("American Football ball is rolling!", americanFootballBall.roll());
    }

}
