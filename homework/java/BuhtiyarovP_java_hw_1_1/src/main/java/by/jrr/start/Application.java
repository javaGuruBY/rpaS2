package by.jrr.start;

public class Application {

    public static void main(String[] args) {

        Addition addition = new Addition(80,60);
        int result = addition.calculate();

        System.out.println("a + b = " + result);


        Subtraction subtraction = new Subtraction(80,60);
        int result1 = subtraction.calculate();

        System.out.println("a - b = " + result1);


        Division division = new Division(80,60);
        int result2 = division.calculate();

        System.out.println("a / b = " + result2);


        Multiplication multiplication = new Multiplication(80,60);
        int result3 = multiplication.calculate();

        System.out.println("a * b = " + result3);


        Remainder remainder = new Remainder(80,60);
        int result4 = remainder.calculate();

        System.out.println("a % b = " + result4);
    }
}
