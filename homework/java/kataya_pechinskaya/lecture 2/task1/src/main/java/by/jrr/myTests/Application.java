package by.jrr.myTests;

import by.jrr.myTests.service.TestService;

public class Application {

    public static void main(String[] args)  {
        TestService testService = new TestService();
        testService.run();


    }
}
