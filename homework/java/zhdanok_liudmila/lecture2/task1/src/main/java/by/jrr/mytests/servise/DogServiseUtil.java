package by.jrr.mytests.servise;

import by.jrr.mytests.bean.Dog;

public class DogServiseUtil {


    public static String bark (Dog dog) {
        return dog.getName() + " BARK!";
    }
}
