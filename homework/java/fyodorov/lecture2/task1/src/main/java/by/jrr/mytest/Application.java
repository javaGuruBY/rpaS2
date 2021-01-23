package by.jrr.mytest;
import by.jrr.mytest.bean.Dog;
import by.jrr.mytest.service.DogService;
import by.jrr.mytest.service.DogServiceUtil;

public class Application {

    public static void main(String[] args) {
        Dog dog = new Dog ();
        dog.setName("Volodya");

        System.out.println(DogServiceUtil.bark(dog));
        DogService dogService = new DogService(dog);
        System.out.println(dogService.bark());
    }
}
