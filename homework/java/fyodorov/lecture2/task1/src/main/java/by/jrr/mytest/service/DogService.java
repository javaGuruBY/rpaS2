package by.jrr.mytest.service;
import by.jrr.mytest.bean.Dog;

public class DogService {

    Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public String bark (){
        return dog.getName () + " BARK!";
    }
}
