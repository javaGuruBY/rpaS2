package by.jrr.start;

import java.util.Random;

public class RandomGeneratorDemo {
    Random random = new Random();

    public int generateRandomInt() {
        return random.nextInt(100);
    }

    public double generateRandomDouble() {
        return Math.random() * this.generateRandomInt();
    }
}
