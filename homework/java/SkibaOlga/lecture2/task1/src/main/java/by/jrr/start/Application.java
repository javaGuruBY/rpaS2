package by.jrr.start;

import by.jrr.start.bean.Dog;
import by.jrr.start.service.DogService;
import by.jrr.start.service.DogServiceUtil;
import by.jrr.start.service.TestService;

public class Application {

    public static void main(String[] args) throws Exception {
        TestService testService =new TestService();
        testService.run();
    }
}
