package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestSwimRingLifesaver {

    SwimRing swimRing;

    @Before
    public void SetUp(){
        swimRing = new SwimRing();
    }

    @Test
    public void testSwimRingLifesaver(){
        assertEquals("I'm inflating!",swimRing.performInflate());
        assertEquals("I'm deflating!",swimRing.performDeflate());
        assertEquals("I'm floating!",swimRing.performFlotation());
        assertEquals("I can't sink!",swimRing.performSink());
        assertEquals("I'm a Swimming ring",swimRing.display());
    }
}
