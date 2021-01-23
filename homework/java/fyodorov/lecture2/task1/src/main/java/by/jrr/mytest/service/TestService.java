package by.jrr.mytest.service;

import by.jrr.mytest.bean.Dog;

public class TestService {
    public void run () throws Exception{
       dogServiceTest();
       dogServiceUtilTest();
    }
    public void dogServiceTest () throws Exception{
        Dog dog = new Dog ();
        dog.setName("Volodya");
        String expected = "Volodya BARK!";

        DogService dogService = new DogService(dog);
        String actual = dogService.bark();
        assertEquals(expected, actual, "dogServiceTest");
    }
    public void dogServiceUtilTest () throws Exception{
        Dog dog = new Dog ();
        dog.setName("Volodya");
        String expected = "BARK! BARK!";

        String actual = DogServiceUtil.bark(dog);
        assertEquals(expected, actual, "dogServiceUtilTest");
    }
    public void assertEquals (String actual, String expected, String testName) throws Exception{
        boolean isPassed = expected.equals(actual);
        if (!isPassed) {
            throw new Exception (testName + " NOT PASSED");
        }
    }
}
