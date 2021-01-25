package by.jrr.mytests.servise;

import by.jrr.mytests.bean.Dog;

public class DogServise {

    Dog dog;

    public DogServise(Dog dog) {
        this.dog = dog;
    }

    public String bark () {
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
