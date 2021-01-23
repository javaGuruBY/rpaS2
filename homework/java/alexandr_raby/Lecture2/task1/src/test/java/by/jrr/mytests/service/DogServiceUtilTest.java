package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;
import junit.framework.TestCase;

public class DogServiceUtilTest extends TestCase {

    public void testBark() {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        String actual = DogServiceUtil.bark(dog);
        assertEquals("dogServiceUtilTest", expected, actual);
    }
}