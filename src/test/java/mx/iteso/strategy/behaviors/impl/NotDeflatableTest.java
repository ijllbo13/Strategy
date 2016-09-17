package mx.iteso.strategy.behaviors.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/14/2016.
 */
public class NotDeflatableTest {
    NotDeflatable notDeflatable;

    @Before
    public void SetUp(){
        notDeflatable = new NotDeflatable();
    }

    @Test
    public void TestNotDeflatableDeflate(){
        assertEquals("I can't deflate!", notDeflatable.deflate());
    }

    @Test
    public void TestNotDeflatableInflate(){
        assertEquals("I can't inflate!", notDeflatable.inflate());
    }
}
