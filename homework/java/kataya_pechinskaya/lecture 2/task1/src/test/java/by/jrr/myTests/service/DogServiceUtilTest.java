package by.jrr.myTests.service;

import by.jrr.myTests.been.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceUtilTest {

    @Test
    public void bark() {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";


        String actual = DogServiceUtil.bark(dog);

        assertEquals("dogServiceUtilTest", expected, actual);
    }
}