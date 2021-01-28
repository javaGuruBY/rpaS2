package by.jrr.homework1.operations;

import org.junit.Assert;
import org.junit.Test;
import java.util.stream.DoubleStream;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void addition() {
        double [] numbers = new double [] {1, 10, 5};
        double expected = DoubleStream.of(numbers).sum();
        double actual = calc.addition(numbers);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void subtraction() {
        double [] numbers = new double [] {1, 10, 5};
        double actual = numbers[0];
        double expected = -14.0;
        actual = calc.subtraction(numbers);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void multiplication() {
        double [] numbers = new double [] {1, 10, 5};
        double actual = numbers[0];
        double expected = 50.0;
        actual = calc.multiplication(numbers);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void devision() throws Exception {
        double [] numbers = new double [] {10, 5};
        double expected = 2.0;
        double actual = calc.devision(numbers);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
