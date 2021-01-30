package by.jrr.myTests;
import by.jrr.myTests.been.Dog;
import by.jrr.myTests.service.DogService;
import by.jrr.myTests.service.DogServiceUtil;
import by.jrr.myTests.service.TestService;

public class Application {

    public static void main(String[] args) throws Exception {
        TestService testService = new TestService();
        testService.run();
    }
}
