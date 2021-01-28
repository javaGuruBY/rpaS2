package math.operations;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Math Operations'!");

        int a = 100;
        int b = 45;

        System.out.println("1) Addition '+':");
        System.out.print("a = ");
        System.out.print(a);
        System.out.print(", ");
        System.out.print("b = ");
        System.out.print(b);

        int sum = a + b; // 1

        System.out.println(); // 2
        System.out.print("a + b = "); // 3
        System.out.print(a); // 4
        System.out.print(" + "); // 5
        System.out.print(b); // 6
        System.out.print(" = "); // 7
        System.out.println(sum);

        System.out.println("2) Subtraction '-':");
        long x = 40;
        long y = 18;
        System.out.println("x = " + x + ", y = " + y);

        long difference = x - y;
        System.out.println("x - y = " + x + " - " + y + " = " + difference);

        System.out.println("3) Division '/':");
        short m = 15;
        short n = 3;
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m / n = " + m + " / " + n + " = " + (15 / 3));
    }
}
