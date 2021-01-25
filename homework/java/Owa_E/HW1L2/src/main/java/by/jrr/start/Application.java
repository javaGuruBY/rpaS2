package by.jrr.start;

import by.jrr.start.bean.Dog;
import by.jrr.start.service.DogService;
import by.jrr.start.service.DogServiceUtil;

public class Application {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("MSH");
        System.out.println(DogServiceUtil.bark(dog));
        DogService dogService = new DogService(dog);
        System.out.println(dogService.bark());
    }
}
