package task1;

public class Subtraction {

    private double a;
    private double b;

    public Subtraction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void calc(double a, double b) {
        double result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }
}
 