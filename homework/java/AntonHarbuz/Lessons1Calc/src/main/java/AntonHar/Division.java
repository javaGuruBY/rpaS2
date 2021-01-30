package AntonHar;

public class Division {
    private double a;
    private double b;


    public Division(double a, double b) {
        System.out.println("double inicializate");
        this.a = a;
        this.b = b;
    }

    public double catculate(){
        double result = 0.0;
        if (b < 0) {
            System.out.println("I don't want calculate negative");
            System.out.println("Operation not supported, default 0.0 has been returned");
        } else if (b > 10) {
            System.out.println("It's a good value to calculate");
            System.out.println("Operation not supported, default 0.0 has been returned");
        } else if (b != 0) {
            result = a / b;
            System.out.println("a / b = " + a / b);
        } else {
            System.out.println("Illigal argument");
            System.out.println("Operation not supported, default 0.0 has been returned");
        }
        return result;
    }
}
