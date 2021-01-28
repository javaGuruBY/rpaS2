package by.jrr.mytests.service;

import by.jrr.mytests.bean.Dog;

public class DogService {
    Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public String bark(){
        return dog.getName() + " BARK!  from dogService";
    }

    public double convertPriceToHrivna(double exchangeRate){
        double convertedPrice = dog.getPrice()*exchangeRate;
        if(convertedPrice > 1000){
            convertedPrice = convertedPrice * 0.97;
        }
        return convertedPrice;
    }
}
