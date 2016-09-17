package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 15/09/2016.
 */
public class TestBeachBall {


    private BeachBall beachBall;


    private String NOR_BOUNCE = "I'm bouncing normally!";
    private String DEFLATE = "I'm deflating!";
    private String INFLATE = "I'm inflating!";
    private String SHORTDRIFT = "I'm flying a short distance!";


    @Before
    public void setUp(){
        beachBall = new BeachBall();
    }


    @Test
    public void testBeachBall() {
        assertEquals(NOR_BOUNCE, beachBall.performBounce());
        assertEquals(DEFLATE, beachBall.performDeflate());
        assertEquals(INFLATE, beachBall.performInflate());
        assertEquals(SHORTDRIFT, beachBall.performAerialDrift());
        assertEquals("Beach ball is rolling!", beachBall.roll());
    }


}
