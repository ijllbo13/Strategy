package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/14/2016.
 */
public class ShortDriftTest {
    @Test
    public void TestShortDriftDrift(){
        ShortDrift shortDrift = new ShortDrift();
        assertEquals("I'm flying a short distance!", shortDrift.drift());
    }
}
