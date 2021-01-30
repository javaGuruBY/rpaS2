package by.jrr.myTests.service;
import by.jrr.myTests.been.Dog;

public class DogService {
    Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public String bark() {
        return dog.getName() + " BARK!";
    }
}
