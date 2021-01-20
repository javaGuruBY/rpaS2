package task1;

public class Addiction {

    private double a;
    private double b;

    public Addiction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void calc(double a, double b) {
        double result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
}
