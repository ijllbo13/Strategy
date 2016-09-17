package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/14/2016.
 */
public class MediumDriftTest {
    @Test
    public void TestMediumDriftDrift(){
        MediumDrift mediumDrift = new MediumDrift();
        assertEquals("I'm flying a normal distance!", mediumDrift.drift());
    }
}
