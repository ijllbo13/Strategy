package mx.iteso.strategy.behaviors.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Jorge on 9/15/2016.
 */
public class SinkableTest {

    Sinkable sinkable;

    @Before
    public void SetUp(){
        sinkable = new Sinkable();
    }

    @Test
    public void TestSinkableSink(){
        assertEquals("I'm sinking!", sinkable.sink());
    }

    @Test
    public void TestSinkableFloat(){
        assertEquals("I can't float!", sinkable.flotate());
    }
}

