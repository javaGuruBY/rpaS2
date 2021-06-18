package lecture_1Dog;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int myValu = 3;
        double newValu = 5.7;

        Dog dog1 = new Dog(3, 40.0);
        dog1.bark();

        Dog dog2 = new Dog(10, 30.0);

        dog1 = dog2;

        dog1.age = 4;
        System.out.println(dog2.age);

        System.out.println();

    }
}
