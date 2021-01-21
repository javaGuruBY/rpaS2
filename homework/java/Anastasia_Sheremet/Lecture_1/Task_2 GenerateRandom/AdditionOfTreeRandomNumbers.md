package by.jrr.start;

public class AdditionOfTreeRandomNumbers {
    RandomGeneratorDemo random = new RandomGeneratorDemo();

    public void addThreeInt() {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < 3; i++) {
            num = random.generateRandomInt();
            System.out.printf("Number %d is %d \n", i + 1, num);
            sum = sum + num;
        }
        System.out.printf("Sum of integers: %d \n \n", sum);
    }

    public void addThreeDouble() {
        double sum = 0;
        double num = 0;
        for (int i = 0; i < 3; i++) {
            num = random.generateRandomDouble();
            System.out.printf("Number %d is %f \n", i + 1, num);
            sum = sum + num;
        }
        System.out.printf("Sum of 'doubls': %f \n", sum);
    }
}
