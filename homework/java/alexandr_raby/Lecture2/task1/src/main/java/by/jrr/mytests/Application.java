package by.jrr.mytests;

import by.jrr.mytests.bean.Dog;
import by.jrr.mytests.service.DogService;
import by.jrr.mytests.service.DogServiceUtil;

public class Application {

    public static void main(String[] args) {

       Dog dog  =  new Dog();
       dog.setName("Malysh");

        System.out.println(DogServiceUtil.bark(dog));
        DogService dogService = new DogService(dog);
        System.out.println(dogService.bark());

    }
}
