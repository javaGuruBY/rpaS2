package by.jrr.start.service;

import by.jrr.start.bean.Dog;

public class DogService {

    Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public String bark() {
        return dog.getName() + " BARK!";
    }

    public double convertPriceToHrivna(double exchangeRate) {
        double convertedPrice = dog.getPrice()*exchangeRate;
        if (convertedPrice > 1000) {
            convertedPrice = convertedPrice * 0.97;
        }
        return convertedPrice;
    }
}
