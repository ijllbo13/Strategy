package mx.iteso.strategy.lifesavers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jorge on 9/15/2016.
 */
public class TestSwimSeatLifesaver {

    SwimSeat swimSeat;

    @Before
    public void SetUp(){
        swimSeat = new SwimSeat();
    }

    @Test
    public void testSwimSeatLifesaver(){
        assertEquals("I'm inflating!",swimSeat.performInflate());
        assertEquals("I'm deflating!",swimSeat.performDeflate());
        assertEquals("I'm floating!",swimSeat.performFlotation());
        assertEquals("I can't sink!",swimSeat.performSink());
        assertEquals("I'm a Swimming seat",swimSeat.display());
    }
}
