package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;

public class DogServiceUtil {
    public static String bark(Dog dog){
        return dog.getName() + " BARK!";
    }
}
