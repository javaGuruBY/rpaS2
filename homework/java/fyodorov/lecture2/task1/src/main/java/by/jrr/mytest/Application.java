package by.jrr.mytest;
import by.jrr.mytest.bean.Dog;
import by.jrr.mytest.service.DogService;
import by.jrr.mytest.service.DogServiceUtil;
import by.jrr.mytest.service.TestService;

public class Application {

    public static void main(String[] args) throws Exception{
        TestService testService = new TestService();
        testService.run();
    }
}
