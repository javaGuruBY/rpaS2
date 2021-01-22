package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;

public class DogServiceUtill {

    public static String bark(Dog dog){
        return dog.getName() + " BARK!  from Utill";
    }
}
