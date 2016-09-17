package mx.iteso.strategy.behaviors.impl;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/14/2016.
 */
public class LongDriftTest {
    @Test
    public void TestLongDriftDrift(){
        LongDrift longDrift = new LongDrift();
        assertEquals("I'm flying really far!", longDrift.drift());
    }
}
