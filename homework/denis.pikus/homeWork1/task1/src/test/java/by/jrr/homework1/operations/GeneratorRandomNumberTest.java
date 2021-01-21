package by.jrr.homework1.operations;

import org.junit.Assert;
import org.junit.Test;

public class GeneratorRandomNumberTest {

    @Test
    public void generatorOfRandomNumbers() {
        GeneratorRandomNumber gen = new GeneratorRandomNumber();
        double[ ] arr = gen.generatorOfRandomNumbers(5, 15);
        int expected = 5;
        int actual = arr.length;
        Assert.assertEquals(expected, actual);
    }
}
