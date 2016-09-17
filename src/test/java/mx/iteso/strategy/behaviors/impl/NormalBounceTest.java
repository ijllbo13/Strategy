package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/14/2016.
 */
public class NormalBounceTest {
    @Test
    public void TestNormalBounceBounce(){
        NormalBounce normalBounce = new NormalBounce();
        assertEquals("I'm bouncing normally!", normalBounce.bounce());
    }
}
