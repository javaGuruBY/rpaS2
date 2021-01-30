package by.jrr.myTests.service;
import by.jrr.myTests.been.Dog;

public   class DogServiceUtil {
    public static String bark(Dog dog) {
        return dog.getName() + " BARK!";
    }
}
