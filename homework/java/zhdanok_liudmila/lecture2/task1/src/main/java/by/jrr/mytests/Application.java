package by.jrr.mytests;

import by.jrr.mytests.bean.Dog;
import by.jrr.mytests.servise.DogServise;
import by.jrr.mytests.servise.DogServiseUtil;

public class Application {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Malysh");

        System.out.println(DogServiseUtil.bark(dog));

        DogServise dogServise = new DogServise(dog);
        System.out.println(dogServise.bark());

    }

}
