package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestWaterTubesLifesaver {

    WaterTubes waterTubes;

    @Before
    public void SetUp(){
        waterTubes = new WaterTubes();
    }

    @Test
    public void testWaterTubesLifesaver(){
        assertEquals("I'm inflating!",waterTubes.performInflate());
        assertEquals("I'm deflating!",waterTubes.performDeflate());
        assertEquals("I'm floating!",waterTubes.performFlotation());
        assertEquals("I can't sink!",waterTubes.performSink());
        assertEquals("I'm a Water Tube",waterTubes.display());
    }
}
