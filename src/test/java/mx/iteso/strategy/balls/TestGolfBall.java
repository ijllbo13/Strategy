package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 15/09/2016.
 */
public class TestGolfBall {


    private GolfBall golfBall;

    private String IRR_BOUNCE = "I'm bouncing irregularly!";
    private String NOT_DEFLATABLE = "I can't deflate!";
    private String NOT_INFLATABLE = "I can't inflate!";
    private String LONGDRIFT = "I'm flying really far!";



    @Before
    public void setUp(){
        golfBall = new GolfBall();
    }


    @Test
    public void testGolfBall() {
        assertEquals(IRR_BOUNCE, golfBall.performBounce());
        assertEquals(NOT_DEFLATABLE, golfBall.performDeflate());
        assertEquals(NOT_INFLATABLE, golfBall.performInflate());
        assertEquals(LONGDRIFT, golfBall.performAerialDrift());
        assertEquals("Golf ball is rolling!", golfBall.roll());
    }


}
