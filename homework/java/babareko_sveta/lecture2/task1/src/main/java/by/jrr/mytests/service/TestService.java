package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;

public class TestService {
    public void run() throws Exception {
        dogServiceTest();
        dogServiceUtilTest();
    }

    public void dogServiceTest() throws Exception {
        Dog dog = new Dog();
        dog.setName("DogName");
        String expected = "DogName BARK!  from dogService";
        DogService dogService= new DogService(dog);
        String actual = dogService.bark();
        assertEquals(expected, actual,"dogServiceTest");
    }

    public void dogServiceUtilTest() throws Exception {
        Dog dog = new Dog();
        String expected = "DogName BARK!  from Utill";
        dog.setName("DogName");
        String actual = DogServiceUtill.bark(dog);
        assertEquals(expected, actual,"dogServiceUtilTest");

    }

    public void assertEquals(String expected, String actual, String testName) throws Exception {
        boolean isPassed = actual.equals(expected);
        if(!isPassed)
            throw new Exception("testName"+" NOT PASSED");
    }
}
