package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceUtilTest {

    @Test
    public void bark() {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        String actual =  DogServiceUtil.bark(dog);

        assertEquals(expected, actual);
    }
}
