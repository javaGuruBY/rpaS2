package by.jrr.mytests;

import by.jrr.mytests.service.TestService;

public class Application {

    public static void main(String[] args) throws Exception {
        TestService testService = new TestService();
        testService.run();
    }
}
