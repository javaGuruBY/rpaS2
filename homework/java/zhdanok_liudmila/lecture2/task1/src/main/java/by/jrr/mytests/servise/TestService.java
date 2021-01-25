package by.jrr.mytests.servise;

import by.jrr.mytests.bean.Dog;
import by.jrr.mytests.servise.DogServise;
import by.jrr.mytests.servise.DogServiseUtil;

public class TestService {

    public void run() throws Exception {
        dogServiceTest();
        dogServiceUtilTest();
    }

    public void dogServiceTest() throws Exception {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "BARK! BARK!";

        DogServise dogServise = new DogServise(dog);
        String actual = dogServise.bark();

        assertEquals(expected, actual, "dogServiceTest");
    }

    public void dogServiceUtilTest() throws Exception {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        String actual = DogServiseUtil.bark(dog);
        assertEquals(expected, actual, "dogServiceUtilTest");
    }

    public void  assertEquals(String expected, String actual, String testName) throws Exception {
        boolean isPassed = expected.equals(actual);
        if(!isPassed) {
            throw new Exception(testName + " NOT PASSED");
        }
    }
}
