package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 15/09/2016.
 */
public class TestPingPongBall {

    private PingPongBall pingPongBall;

    private String NOR_BOUNCE = "I'm bouncing normally!";
    private String NOT_DEFLATABLE = "I can't deflate!";
    private String NOT_INFLATABLE = "I can't inflate!";
    private String SHORTDRIFT = "I'm flying a short distance!";


    @Before
    public void setUp(){
        pingPongBall = new PingPongBall();
    }


    @Test
    public void testPingPongBall() {
        assertEquals(NOR_BOUNCE, pingPongBall.performBounce());
        assertEquals(NOT_DEFLATABLE, pingPongBall.performDeflate());
        assertEquals(NOT_INFLATABLE, pingPongBall.performInflate());
        assertEquals(SHORTDRIFT, pingPongBall.performAerialDrift());
        assertEquals("Ping Pong ball is rolling!", pingPongBall.roll());
    }


}
