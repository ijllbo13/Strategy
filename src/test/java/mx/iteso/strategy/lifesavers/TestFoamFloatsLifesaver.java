package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestFoamFloatsLifesaver {

    FoamFloats foamFloats;

    @Before
    public void SetUp(){
        foamFloats = new FoamFloats();
    }

    @Test
    public void testFoamFloatsLifesaver(){
        assertEquals("I can't inflate!",foamFloats.performInflate());
        assertEquals("I can't deflate!",foamFloats.performDeflate());
        assertEquals("I'm floating!",foamFloats.performFlotation());
        assertEquals("I can't sink!",foamFloats.performSink());
        assertEquals("I'm a Foam Float",foamFloats.display());
    }
}
