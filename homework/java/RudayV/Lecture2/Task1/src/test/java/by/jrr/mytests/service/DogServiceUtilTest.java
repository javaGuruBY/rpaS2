package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceUtilTest {
    @Test
    public void Bark1() {
        Dog dog = new Dog();
        dog.setName("Kolya");
        String expected = "Kolya BARK!";
        String actual = DogServiceUtil.bark(dog);
        assertEquals(expected, actual);
    }
}