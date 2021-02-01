package AntonHar.service;

import AntonHar.bean.Dog;

import java.security.spec.ECField;

public class TestService {

    public void run() throws Exception {

        dogServiceTest();
        dogServiceUtilTest();
    }

    public void dogServiceTest() throws Exception {
        Dog dog = new Dog();
        dog.setName("Kolija");
        String expected = "Kolija Bark!";

        DogService dogService = new DogService(dog);
        String actual = dogService.bark();

        System.out.print("dogServiceTest begin... ");
        assertEquals(expected, actual, "dogServiceTest");

    }

    public void dogServiceUtilTest() throws Exception {
        Dog dog = new Dog();
        dog.setName("Kolija");
        String expected = "Kolija Bark!";

        String actual = DogServiceUtil.bark(dog);

        System.out.print("dogServiceUtilTest begin... ");
        assertEquals(expected, actual, "dogServiceUtilTest");
    }

    public void assertEquals(String expected, String actual, String testName) throws Exception{
        boolean isPassed = expected.equals(actual);
        if (!isPassed){
            throw new Exception(testName + " NOT PASSED");
        }
        else System.out.println("the test was successful!");
    }
}
