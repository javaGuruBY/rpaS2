package by.jrr.start.service;

import by.jrr.start.bean.Dog;

public class DogServiceUtil {

    public static String bark(Dog dog) {
        return dog.getName() + " BARK!";
    }
}
