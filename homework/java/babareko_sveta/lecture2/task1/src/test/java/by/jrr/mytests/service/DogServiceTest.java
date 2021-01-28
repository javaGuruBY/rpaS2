package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;
import junit.framework.TestCase;
import org.junit.Test;

public class DogServiceTest extends TestCase {

    public void testBark() {
        Dog dog = new Dog();
        dog.setName("DogName");
        String expected = "DogName BARK!  from dogService";
        DogService dogService= new DogService(dog);
        String actual = dogService.bark();
        assertEquals( expected, actual);
    }

    @Test
    public void testConvertPriceToHrivna_noDisconting() {
        Dog dog = new Dog();
        dog.setPrice(30);
        double exchangeRate = 28.25;
        double expected = 847.5;//2658.0425  97d * 28.25 * 0.97;
        DogService dogService= new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRate);
        assertEquals( expected, actual, 0.01);
    }


    @Test
    public void testConvertPriceToHrivna_shouldReturnWithDiscont() {
        Dog dog = new Dog();
        dog.setPrice(97);
        double exchangeRate = 28.25;
        double expected = 2658.04;//2658.0425  97d * 28.25 * 0.97;
        DogService dogService= new DogService(dog);
        double actual = dogService.convertPriceToHrivna(exchangeRate);
        assertEquals( expected, actual, 0.01);
    }
}