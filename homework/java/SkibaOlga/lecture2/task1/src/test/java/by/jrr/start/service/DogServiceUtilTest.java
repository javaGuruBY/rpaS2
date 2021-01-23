package by.jrr.start.service;

import by.jrr.start.bean.Dog;
import junit.framework.TestCase;

public class DogServiceUtilTest extends TestCase {

    public void testBark() {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh";

        String actual = DogServiceUtil.bark(dog);
        assertEquals(expected, actual);
    }
}