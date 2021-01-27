package lecture_1Dog;

public class Dog {

    int age;
    double price;
    String name = "Bobik";

    Dog (int a, double b) {
        age = a;
        price = b;
        System.out.println("Dog has been created");
        System.out.println(age);
        System.out.println(price);
        bark();
    }

    public void bark (){
        System.out.println("dog say:");
        System.out.println("Hay hay");
    }
}
