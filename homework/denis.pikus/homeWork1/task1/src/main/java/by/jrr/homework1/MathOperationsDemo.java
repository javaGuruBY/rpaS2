package by.jrr.homework1;

import by.jrr.homework1.operations.Calculator;

public class MathOperationsDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.addition(5, 6, 1);
        calc.subtraction(3, 1, 10);
        calc.multiplication(-2, 3, 6);
        calc.devision(10, 5, 55);
    }
}
