package AntonHar;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Test
    public void catculate() {
        double a = 6;
        double b = 4;
        double aktual = 1.5;
        double fakt = a / b;

        assertEquals(aktual, fakt, 0.01);
    }
}