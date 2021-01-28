package by.jrr.homework1;

import by.jrr.homework1.operations.Calculator;

public class MathOperationsDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.addition(5, 6, 1));
        System.out.println(calc.subtraction(3, 1, 10));
        System.out.println(calc.multiplication(-2, 3, 6));
        try {
            System.out.println(calc.devision(10, 5, 55));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
