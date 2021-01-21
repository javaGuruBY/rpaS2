package by.jrr.start;

import java.util.Random;

public class Application {
    public static void main(String[] args) {

        Random rnd = new Random();
        int a = rnd.nextInt(50);
        int b = rnd.nextInt(50);
        MathOperationDemo mathOperation = new MathOperationDemo(a, b);
        mathOperation.addition();
        mathOperation.subtraction();
        mathOperation.multiplication();
        mathOperation.division();

    }
}
