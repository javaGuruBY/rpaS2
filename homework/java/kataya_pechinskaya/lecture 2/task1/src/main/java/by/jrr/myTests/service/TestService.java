package by.jrr.myTests.service;

import by.jrr.myTests.been.Dog;

public class TestService {
    public  void run() throws Exception {
        dogServiceTest();
        dogServiceUtilTest();
    }
    public void dogServiceTest() throws Exception {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";

        DogService dogService = new DogService(dog);
        String actual = dogService.bark();

        assertEquals(expected, actual, "dogServiceTest");
    }
    public void dogServiceUtilTest() throws Exception {
        Dog dog = new Dog();
        dog.setName("Malysh");
        String expected = "Malysh BARK!";


        String actual = DogServiceUtil.bark(dog);

        assertEquals(expected, actual, "dogServiceUtilTest");
    }

    public void assertEquals(String expected, String actual, String testName) throws Exception {
        boolean isPassed = expected.equals(actual);
        if(!isPassed) {
            throw new Exception(testName + "NOT PASSED");
        }
    }
}
