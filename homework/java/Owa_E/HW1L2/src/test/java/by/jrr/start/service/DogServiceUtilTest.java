package by.jrr.start.service;

import by.jrr.start.bean.Dog;
import junit.framework.TestCase;
import org.junit.Test;

public class DogServiceUtilTest extends TestCase {
    @Test
    public void testBark() {
        Dog dog = new Dog();
        dog.setName("MSH");
        String expected = "MSH BARK!";
        String actual = DogServiceUtil.bark(dog);
        assertEquals(expected,actual);
    }
}