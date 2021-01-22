package task1;

public class Multiplication {

    private double a;
    private double b;

    public Multiplication(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void calc(double a, double b) {
        double result = a * b;
        System.out.println(a + " * " + b + " = " + result);
    }
}
