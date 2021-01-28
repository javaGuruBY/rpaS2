package by.jrr.start.service;

import by.jrr.start.bean.Dog;
import junit.framework.TestCase;
import org.junit.Test;

public class DogServiceTest extends TestCase {
    @Test
    public void testBark() {
        Dog dog = new Dog();
        dog.setName("MSH");
        String expected = "MSH BARK!";
        DogService dogService = new DogService(dog);
        String actual = dogService.bark();
        assertEquals(expected,actual );
    }

    public void testConvertPriceToHrivna_NoDiscount() {
        Dog dog = new Dog();
        dog.setPrice(30);
        double exchangeRange = 28.25;
        double expected = 847.5;
        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRange);
        assertEquals(expected,actual , 0.01);
    }
    public void testConvertPriceToHrivna_WithDiscount() {
        Dog dog = new Dog();
        dog.setPrice(97);
        double exchangeRange = 28.25;
        double expected = 2658.04;//2658.0425
        DogService dogService = new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRange);
        assertEquals(expected,actual , 0.01);
    }
}
