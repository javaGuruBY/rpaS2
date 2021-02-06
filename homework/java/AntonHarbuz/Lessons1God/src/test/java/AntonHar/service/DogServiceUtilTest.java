package AntonHar.service;

import AntonHar.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiceUtilTest {

    @Test
    public void bark() {
        Dog dog = new Dog();
        dog.setName("Kolija");
        String expected = "Kolija Bark!";

        String actual = DogServiceUtil.bark(dog);

        System.out.print("dogServiceUtilTest begin... ");
        assertEquals("dogServiceUtilTest", expected, actual);
    }
}