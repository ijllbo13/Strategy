package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestLifesaversCandiesLifesaver {

    LifesaversCandies lifesaversCandies;

    @Before
    public void SetUp(){
        lifesaversCandies = new LifesaversCandies();
    }

    @Test
    public void testLifesaversCandiesLifesaver(){
        assertEquals("I can't inflate!",lifesaversCandies.performInflate());
        assertEquals("I can't deflate!",lifesaversCandies.performDeflate());
        assertEquals("I can't float!",lifesaversCandies.performFlotation());
        assertEquals("I'm sinking!",lifesaversCandies.performSink());
        assertEquals("I'm a Lifesaver candy",lifesaversCandies.display());
    }
}
