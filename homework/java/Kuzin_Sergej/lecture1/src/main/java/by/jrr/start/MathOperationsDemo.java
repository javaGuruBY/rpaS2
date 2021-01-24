package by.jrr.start;
import by.jrr.start.service.Addition;
import by.jrr.start.service.Division;
import by.jrr.start.service.Multiplication;
import by.jrr.start.service.Subtraction;

import java.util.Scanner;

public class MathOperationsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("enter second number");
        double secondNumber = scanner.nextDouble();
        System.out.println("check number of operation that you need:\n 1. Addition;\n 2. Subtraction;\n " +
                "3. Multiplication;\n 4. Division;");
        int operationNumber = scanner.nextInt();
        switch (operationNumber) {
            case 1:
                Addition.calculate(firstNumber, secondNumber);
                break;
            case 2:
                Subtraction.calculate(firstNumber,secondNumber);
                break;
            case  3:
                Multiplication.calculate(firstNumber, secondNumber);
                break;
            case  4:
                Division.calculate(firstNumber,secondNumber);
                break;
        }
    }
}
