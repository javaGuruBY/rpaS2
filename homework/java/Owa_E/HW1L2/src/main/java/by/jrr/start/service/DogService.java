package by.jrr.start.service;
import by.jrr.start.bean.Dog;

public class DogService {
    Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public String bark(){
        return dog.getName()+" BARK!";
    }
    public double convertPriceToHrivna(double exchangeRate){
        double convertToPrice = dog.getPrice()*exchangeRate;
        if (convertToPrice>1000){
            convertToPrice*=0.97;
        }
        return convertToPrice;
    }

}
