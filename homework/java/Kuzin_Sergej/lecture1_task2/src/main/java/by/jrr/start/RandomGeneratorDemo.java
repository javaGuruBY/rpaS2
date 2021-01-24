package by.jrr.start;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            double randomGenerateNumber = (Math.random()*(100 - (-100)) -100);
            System.out.println(randomGenerateNumber);
        }
    }
}
