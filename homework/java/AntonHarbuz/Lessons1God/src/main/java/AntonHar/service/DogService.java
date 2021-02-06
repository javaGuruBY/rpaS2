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

    public double convertPriceToHrivna(double exchangeRate) {
        double convertedPrice = dog.getPrice()*exchangeRate;
        if (convertedPrice > 1000) convertedPrice = convertedPrice * 0.97;
        return convertedPrice;

    }
}
