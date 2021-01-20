package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;
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

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertPriceToHrivna_noDiconting() {
        Dog dog = new Dog();
        dog.setPrice(30);
        double exchangeRate = 28.25;
        double expected = 847.5;

        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRate);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void convertPriceToHrivna_shouldReturnWithDicont() {
        Dog dog = new Dog();
        dog.setPrice(97);
        double exchangeRate = 28.25;
        double expected = 2658.04;

        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRate);

        Assert.assertEquals(expected, actual, 0.01);
    }
}
