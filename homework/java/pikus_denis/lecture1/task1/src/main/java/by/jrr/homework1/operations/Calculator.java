package by.jrr.homework1.operations;

import java.util.Arrays;

public class Calculator {
    double sum;
    double sub;
    double mult = 1;
    double dev;

    public void addition(double ... numbers){
        for (Double num: numbers) {
            sum += num;
        }
        System.out.println("Additions numbers " + Arrays.toString(numbers) + " = " + sum);
    }

    public void subtraction(double ... numbers){
        sub = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sub -= numbers[i];
        }
        System.out.println("Subtractions numbers " + Arrays.toString(numbers) + " = " + sub);
    }

    public void multiplication(double ... numbers){
        for (Double num: numbers) {
            mult *= num;
        }
        System.out.println("Multiplications numbers " + Arrays.toString(numbers) + " = " + mult);
    }

    public void devision(double ... numbers){
        dev = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                System.out.println("Division by 0 is impossible!");
                return;
            }
            else {
                dev /= numbers[i];
            }
        }
        System.out.println("Devisions numbers " + Arrays.toString(numbers) + " = " + dev);
    }


}
