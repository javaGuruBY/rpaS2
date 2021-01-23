package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;

public class TestService {
    public void run() throws Exception {
        dogServiceTest();
        dogServiceUtilTest();
    }
    public void dogServiceTest () throws Exception {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        DogService dogService = new DogService(dog);
        String actual = dogService.bark();
        assetrEquals(expected, actual, "dogServiceTest");
    }
    public void dogServiceUtilTest () throws Exception {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "BARK!     BARK!";

        String actual = DogServiceUtil.bark(dog);
        assetrEquals(expected, actual, "dogServiceUtilTest");

    }
    public void assetrEquals(String expected, String actual, String testName) throws Exception {
        boolean isPassed = expected.equals(actual);
        if (!isPassed) {
            throw new Exception(testName + " NOT PASSED ");

        }
    }
}
