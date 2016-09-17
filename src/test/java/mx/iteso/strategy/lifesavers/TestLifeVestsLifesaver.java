package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestLifeVestsLifesaver {

    LifeVests lifeVests;

    @Before
    public void SetUp(){
        lifeVests = new LifeVests();
    }

    @Test
    public void testLifeVestsLifesaver(){
        assertEquals("I'm inflating!",lifeVests.performInflate());
        assertEquals("I'm deflating!",lifeVests.performDeflate());
        assertEquals("I'm floating!",lifeVests.performFlotation());
        assertEquals("I can't sink!",lifeVests.performSink());
        assertEquals("I'm a Life Vest",lifeVests.display());
    }
}
