package by.jrr.start;

import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        System.out.println(randomGenerator.nextInt(1001));
        System.out.println(randomGenerator.nextInt(1001));
        System.out.println(randomGenerator.nextInt(1001));
        System.out.println(randomGenerator.nextInt(1001));
        System.out.println(randomGenerator.nextInt(1001));

    }
}
