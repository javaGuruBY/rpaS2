package by.jrr.myTests.service;

import by.jrr.myTests.been.Dog;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceTest {

    @Test
    public void bark() {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        DogService dogService = new DogService(dog);
        String actual = dogService.bark();

        Assert.assertEquals("dogServiceTest", expected, actual);
    }

    @Test
    public void convertPriceToHrivna_noDisconting() {
        Dog dog = new Dog();
        dog.setPrice(30);
        double exchangeRade = 28.25;
        double expected = 847.5; //2658.0425

        DogService dogService = new DogService(dog);
       double actual = dogService.convertPriceToHrivna(exchangeRade);

        Assert.assertEquals(expected, actual, 0.01);

    }
    @Test
    public void convertPriceToHrivna_shouldReturnWithDiscont() {
        Dog dog = new Dog();
        dog.setPrice(97);
        double exchangeRade = 28.25;
        double expected = 2658.04; //2658.0425

        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRade);

        Assert.assertEquals(expected, actual, 0.01);

    }
}