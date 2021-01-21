package by.jrr.mytests;

import by.jrr.mytests.bean.Dog;
import by.jrr.mytests.service.DogService;
import by.jrr.mytests.service.DogServiceUtill;

public class Application {

    public static void main(String[] args) {

        System.out.println("Hello World");
        Dog dog = new Dog();
        dog.setName("DogName");

        System.out.println(DogServiceUtill.bark(dog));

        DogService dogService= new DogService(dog);
        System.out.println(dogService.bark());
    }
}
