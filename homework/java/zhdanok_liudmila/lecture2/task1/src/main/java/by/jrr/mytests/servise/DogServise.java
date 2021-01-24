package by.jrr.mytests.servise;

import by.jrr.mytests.bean.Dog;

public class DogServise {

    Dog dog;

    public DogServise(Dog dog) {
        this.dog = dog;
    }

    public String bark () {
        return dog.getName() + " BARK!";
    }
}
