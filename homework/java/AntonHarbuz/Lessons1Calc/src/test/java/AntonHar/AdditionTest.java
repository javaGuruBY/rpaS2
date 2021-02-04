package AntonHar;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void catculate() {
        int a = 6;
        int b = 4;
        int aktual = 10;
        int fakt = a + b;

        assertEquals(aktual, fakt);
    }
}