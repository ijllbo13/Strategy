package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestSwimBeltsLifesaver {

    SwimBelts swimBelts;

    @Before
    public void SetUp(){
        swimBelts = new SwimBelts();
    }

    @Test
    public void testSwimBeltsLifesaver(){
        assertEquals("I can't inflate!",swimBelts.performInflate());
        assertEquals("I can't deflate!",swimBelts.performDeflate());
        assertEquals("I'm floating!",swimBelts.performFlotation());
        assertEquals("I can't sink!",swimBelts.performSink());
        assertEquals("I'm a Swimming Belt",swimBelts.display());
    }
}
