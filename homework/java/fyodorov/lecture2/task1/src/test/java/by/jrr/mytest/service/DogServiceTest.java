package by.jrr.mytest.service;

import by.jrr.mytest.bean.Dog;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceTest {

    @Test
    public void bark() {
        Dog dog = new Dog ();
        dog.setName("Volodya");
        String expected = "Volodya BARK!";

        DogService dogService = new DogService(dog);
        String actual = dogService.bark();
        Assert.assertEquals("dogServiceTest", expected, actual);
    }

    @Test
    public void convertPriceToBelarus_noDiscont() {
        Dog dog = new Dog ();
        dog.setPrice (300);
        double exchangeRate = 2.54;
        double expected = 762; //762

        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToBelarus(exchangeRate);
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void convertPriceToBelarus_shouldReturnWithDiscont() {
        Dog dog = new Dog ();
        dog.setPrice (1200);
        double exchangeRate = 2.54;
        double expected = 2956.56; //3048

        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToBelarus(exchangeRate);
        Assert.assertEquals(expected, actual, 0.01);
    }

}