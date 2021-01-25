package by.jrr.mytests.servise;

import by.jrr.mytests.bean.Dog;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiseTest {

    @Test
    public void bark() {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        DogServise dogServise = new DogServise(dog);
        String actual = dogServise.bark();

        assertEquals(expected, actual );
    }

    @Test
    public void convertPriceToHrivna_noDisconting() {
        Dog dog = new Dog();
        dog.setPrice(30);
        double exchangeRate = 28.25;
        double expected = 847.5;

        DogServise dogServise = new DogServise(dog);
        double actual = dogServise.convertPriceToHrivna(exchangeRate);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void convertPriceToHrivna_chouldReturnWithDiscount() {
        Dog dog = new Dog();
        dog.setPrice(97);
        double exchangeRate = 28.25;
        double expected = 2658.04; //2658.0425

        DogServise dogServise = new DogServise(dog);
        double actual = dogServise.convertPriceToHrivna(exchangeRate);

        assertEquals(expected, actual, 0.01);
    }
}