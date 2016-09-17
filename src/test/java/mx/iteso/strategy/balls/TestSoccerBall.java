package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 15/09/2016.
 */
public class TestSoccerBall
{

    private SoccerBall soccerBall;

    private String NOR_BOUNCE = "I'm bouncing normally!";
    private String DEFLATE = "I'm deflating!";
    private String INFLATE = "I'm inflating!";
    private String MEDIUMDRIFT = "I'm flying a normal distance!";


    @Before
    public void setUp(){
        soccerBall = new SoccerBall();
    }


    @Test
    public void testSoccerBall() {
        assertEquals(NOR_BOUNCE, soccerBall.performBounce());
        assertEquals(DEFLATE, soccerBall.performDeflate());
        assertEquals(INFLATE, soccerBall.performInflate());
        assertEquals(MEDIUMDRIFT, soccerBall.performAerialDrift());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
