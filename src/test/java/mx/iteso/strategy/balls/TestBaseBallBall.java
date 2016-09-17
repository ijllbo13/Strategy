package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestBaseBallBall {
    private BaseballBall baseballBall;

    private String IRR_BOUNCE = "I'm bouncing irregularly!";
    private String NOT_DEFLATABLE = "I can't deflate!";
    private String NOT_INFLATABLE = "I can't inflate!";
    private String LONGDRIFT = "I'm flying really far!";


    @Before
    public void setUp(){
        baseballBall = new BaseballBall();
    }

    @Test
    public void testAmericanFootballBall() {
        assertEquals(IRR_BOUNCE, baseballBall.performBounce());
        assertEquals(NOT_DEFLATABLE, baseballBall.performDeflate());
        assertEquals(NOT_INFLATABLE, baseballBall.performInflate());
        assertEquals(LONGDRIFT, baseballBall.performAerialDrift());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
    }
}
