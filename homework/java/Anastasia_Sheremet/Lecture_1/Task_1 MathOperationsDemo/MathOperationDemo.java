package by.jrr.start;

import java.util.Random;

public class MathOperationDemo {
    Random rnd = new Random();
    int a;
    int b;

    public MathOperationDemo(int a, int b){
        this.a = a;
        this.b = b;
        System.out.printf("a = %d \n", a);
        System.out.printf("b = %d \n", b);
    }

    public void addition () {
        int sum = a + b;
        System.out.printf("a + b = %d \n", sum);
    }

    public void subtraction () {
        int sub = a - b;
        System.out.printf("a - b = %d \n", sub);
    }

    public void multiplication () {
        int mult = a * b;
        System.out.printf("a * b = %d \n", mult);
    }

    public void division () {
        double div = (double) a / b;
        if (b == 0)  {
            System.out.println("Division by 0 is impossible!");
        } else {
            System.out.printf("a / b = %f \n", div);
        }
    }

}
