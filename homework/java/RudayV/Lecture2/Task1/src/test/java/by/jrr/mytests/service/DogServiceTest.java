package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceTest {

    @Test
    public void bark() {
        Dog dog = new Dog();
        dog.setName("Kolya");
        DogService dogService = new DogService(dog);
        String expected = "Kolya BARK!";
        String actual = dogService.bark();
        assertEquals(expected, actual);
    }

    @Test
    public void Bark1() {
        Dog dog = new Dog();
        dog.setName("Kolya");
        String expected = "Kolya BARK!";
        String actual = DogServiceUtil.bark(dog);
        assertEquals(expected, actual);
    }

    @Test
    public void convertPriceToHrivna_ShoudReturnWithDiscount() {
        Dog dog = new Dog();
        dog.setPrice(97);
        DogService dogService = new DogService(dog);
        double exchangeRate = 28.25;
        double expected = 2658.0425;
        double actual = dogService.convertPriceToHrivna(exchangeRate);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void convertPriceToHrivna_ShoudReturnWithoutDiscount() {
        Dog dog = new Dog();
        dog.setPrice(30);
        DogService dogService = new DogService(dog);
        double exchangeRate = 28.25;
        double expected = 847.5;
        double actual = dogService.convertPriceToHrivna(exchangeRate);
        Assert.assertEquals(expected, actual, 0.01);
    }
}