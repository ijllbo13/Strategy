package mx.iteso.strategy.behaviors.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Jorge on 9/15/2016.
 */
public class FloatableTest {

    Floatable floatable;

    @Before
    public void SetUp(){
        floatable = new Floatable();
    }

    @Test
    public void TestFloatableSink(){
        assertEquals("I can't sink!", floatable.sink());
    }

    @Test
    public void TestFloatableFloat(){
        assertEquals("I'm floating!", floatable.flotate());
    }
}
