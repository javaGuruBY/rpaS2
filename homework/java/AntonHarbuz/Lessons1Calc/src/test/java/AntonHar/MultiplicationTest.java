package AntonHar;

import junit.framework.TestCase;

public class MultiplicationTest extends TestCase {


    public void testCatculate() {
        int a = 4;
        int b = 6;
        int aktual = 24;
        int fakt = a * b;

        assertEquals(aktual, fakt);

    }
}