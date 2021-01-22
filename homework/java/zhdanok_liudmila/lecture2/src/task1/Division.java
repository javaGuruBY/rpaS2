package task1;

public class Division {

    private double a;
    private double b;

    public Division(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void calc(double a, double b) {
        if (b != 0.0) {
            double result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } else
            System.out.println("Невозможно выполнить деление на 0");
    }

}
