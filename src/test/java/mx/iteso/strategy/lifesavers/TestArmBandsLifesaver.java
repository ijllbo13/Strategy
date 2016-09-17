package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestArmBandsLifesaver {

    ArmBands armBands;

    @Before
    public void SetUp(){
        armBands = new ArmBands();
    }

    @Test
    public void testArmBandsLifesaver(){
        assertEquals("I'm inflating!",armBands.performInflate());
        assertEquals("I'm deflating!",armBands.performDeflate());
        assertEquals("I'm floating!",armBands.performFlotation());
        assertEquals("I can't sink!",armBands.performSink());
        assertEquals("I'm a Arm bands",armBands.display());
    }
}
