package by.jrr.mytest.service;

import by.jrr.mytest.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceUtilTest {

    @Test
    public void bark() {
        Dog dog = new Dog ();
        dog.setName("Volodya");
        String expected = "Volodya BARK!";

        String actual = DogServiceUtil.bark(dog);
        assertEquals(expected, actual);
    }
}