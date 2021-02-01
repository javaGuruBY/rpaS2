package AntonHar.service;

import AntonHar.bean.Dog;

public class DogService {

    Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public String bark() {
        return dog.getName() + " Bark!";
    }
}
