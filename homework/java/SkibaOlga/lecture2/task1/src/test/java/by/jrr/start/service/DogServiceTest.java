package by.jrr.start.service;

import by.jrr.start.bean.Dog;
import junit.framework.TestCase;
import org.junit.Assert;

public class DogServiceTest extends TestCase {

    public void testBark() {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        DogService dogService = new DogService(dog);
        String actual = dogService.bark();
        Assert.assertEquals(expected, actual);
    }

    public void testConvertPriceToHrivna_noDiscounting() {
        Dog dog = new Dog();
        dog.setPrice(30);
        double exchangeRate = 28.25;
        double expected = 847.5;

        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRate);

        Assert.assertEquals(expected, actual, 0.01);
    }

    public void testConvertPriceToHrivna_shouldReturnWithDiscount() {
        Dog dog = new Dog();
        dog.setPrice(97);
        double exchangeRate = 28.25;
        double expected = 2658.04; //2658.0425

        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRate);

        Assert.assertEquals(expected, actual, 0.01);
    }
}