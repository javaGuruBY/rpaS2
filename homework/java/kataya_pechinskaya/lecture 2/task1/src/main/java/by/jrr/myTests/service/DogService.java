package by.jrr.myTests.service;
import by.jrr.myTests.been.Dog;

public class DogService {
    Dog dog;

    public DogService(Dog dog) {
        this.dog = dog;
    }

    public String bark() {
        return dog.getName() + " BARK!";
    }
    public double convertPriceToHrivna(double exchangeRate) {
        double convertPrice = dog.getPrice() * exchangeRate;
        if (convertPrice > 1000) {
            convertPrice = convertPrice * 0.97;
        }
        return  convertPrice;
    }
}
