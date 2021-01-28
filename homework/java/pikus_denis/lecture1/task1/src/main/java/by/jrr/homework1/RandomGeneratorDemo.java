package by.jrr.homework1;

import by.jrr.homework1.operations.Calculator;
import by.jrr.homework1.operations.GeneratorRandomNumber;

import java.util.Arrays;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        GeneratorRandomNumber gen = new GeneratorRandomNumber();
        double[] arr = gen.generatorOfRandomNumbers(3, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(calc.addition(arr));
        System.out.println(calc.subtraction(arr));
        System.out.println(calc.multiplication(arr));
        try {
            System.out.println(calc.devision(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
