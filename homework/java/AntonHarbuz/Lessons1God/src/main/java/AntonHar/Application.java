package AntonHar;

import AntonHar.bean.Dog;
import AntonHar.service.DogService;
import AntonHar.service.DogServiceUtil;
import AntonHar.service.TestService;

public class Application {
    public static void main(String[] args) throws Exception {

        TestService testService = new TestService();
        testService.run();
    }
}
