package AntonHar;

import AntonHar.bean.Dog;
import AntonHar.service.DogService;
import AntonHar.service.DogServiceUtil;

public class Application {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Kolija");

        System.out.println(DogServiceUtil.bark(dog));

        DogService dogService = new DogService(dog);
        System.out.println(dogService.bark());
    }
}
