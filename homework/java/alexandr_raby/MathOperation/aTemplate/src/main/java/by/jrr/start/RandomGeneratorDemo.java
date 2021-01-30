package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int xRandom   = randomGenerator.nextInt(14);
        int yRandom = randomGenerator.nextInt(45);
        int zRandom = randomGenerator.nextInt(25);

        System.out.println("xRandom = " + xRandom);
        System.out.println("yRandom = " + yRandom);
        System.out.println("zRandom = " + zRandom);

        int sum = xRandom + yRandom + zRandom;

        System.out.println("xRandom + yRandom + zRandom = " + xRandom + " + " + yRandom + " + " + zRandom + " = " + sum);

    }
}
