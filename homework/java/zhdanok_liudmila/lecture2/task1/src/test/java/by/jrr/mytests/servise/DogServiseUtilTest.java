package by.jrr.mytests.servise;

import by.jrr.mytests.bean.Dog;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogServiseUtilTest {

    @Test
    public void bark() {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        String actual = DogServiseUtil.bark(dog);
        assertEquals(expected, actual);

    }
}