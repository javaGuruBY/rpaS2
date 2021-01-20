package by.jrr.homework1;

import by.jrr.homework1.operations.Calculator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Random rnd = new Random();
        double[] arr = new double[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(15);
        }
        System.out.println(Arrays.toString(arr));
        calc.addition(arr);
        calc.subtraction(arr);
        calc.multiplication(arr);
        calc.devision(arr);
    }
}
