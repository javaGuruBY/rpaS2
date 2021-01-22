package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceUtillTest {

    @Test
    public void bark() {
        Dog dog = new Dog();
        String expected = "DogName BARK!  from Utill";
        dog.setName("DogName");
        String actual = DogServiceUtill.bark(dog);
        assertEquals(expected, actual);
    }
}