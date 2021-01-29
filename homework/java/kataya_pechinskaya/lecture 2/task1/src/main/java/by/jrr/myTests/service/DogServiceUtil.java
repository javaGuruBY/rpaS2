package by.jrr.myTests.service;
import by.jrr.myTests.been.Dog;

public class DogService {
    Dog dog;
    public String bark() {
        return dog.getName() + "BARK!";
    }
}
