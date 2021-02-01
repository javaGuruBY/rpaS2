package AntonHar.service;

import AntonHar.bean.Dog;

public class DogServiceUtil {


    public static String bark(Dog dog) {
        return dog.getName() + " Bark!";
    }
}
