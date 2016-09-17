package mx.iteso.strategy.balls;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 15/09/2016.
 */
public class TestCrystalBall {

    private CrystalBall crystalBall;

    private String CRASH = "I crashed!! I can't bounce";
    private String NOT_DEFLATABLE = "I can't deflate!";
    private String NOT_INFLATABLE = "I can't inflate!";
    private String MEDIUMDRIFT = "I'm flying a normal distance!";


    @Before
    public void setUp(){
        crystalBall = new CrystalBall();
    }

    @Test
    public void testCrystalBall() {
        assertEquals(CRASH, crystalBall.performBounce());
        assertEquals(NOT_DEFLATABLE, crystalBall.performDeflate());
        assertEquals(NOT_INFLATABLE, crystalBall.performInflate());
        assertEquals(MEDIUMDRIFT, crystalBall.performAerialDrift());
        assertEquals("Crystal ball is rolling!", crystalBall.roll());
    }

}
