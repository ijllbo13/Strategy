package mx.iteso.strategy.behaviors.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeflatableTest {
    Deflatable deflatable;

    @Before
    public void setUp() {
        deflatable = new Deflatable();
    }

    @Test
    public void testDeflatableDeflate() {
        assertEquals("I'm deflating!",deflatable.deflate());

    }

    @Test
    public void testDeflatableInflate() {
        assertEquals("I'm inflating!",deflatable.inflate());

    }
}
