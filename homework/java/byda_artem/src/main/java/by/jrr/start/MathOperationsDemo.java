package by.jrr.start;

public class MathOperationsDemo {
    private int a;
    private int b;
    private int result;

    public MathOperationsDemo(int a, int b){
        this.a = a;
        this.b = b;
    }

    private void addition(){
        result = a + b;
        System.out.printf("Addition: %d + %d = %d\n", a, b, result);
    }

    private void subtraction(){
        result = a - b;
        System.out.printf("Subtraction: %d - %d = %d\n", a, b, result);
    }

    private void multiply(){
        result = a * b;
        System.out.printf("Multiply: %d * %d = %d\n", a, b , result);
    }

    private void division(){
        result = a / b;
        System.out.printf("Division: %d / %d = %d", a, b, result);
    }

    public void start(){
        addition();
        subtraction();
        multiply();
        division();
    }
}

