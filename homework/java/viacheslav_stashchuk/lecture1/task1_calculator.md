'''
package by.jrr.start;
import java.util.Scanner;
public class MathOperationsDemo {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Choose the math operation and the number of it:" + "\n   1) Subtraction" +
                "\n   2) Addition" + "\n   3) Multiplication" + "\n   4) Division" + "\n   5)Exit the calculator");
        while(true){
            int n = scan.nextInt();
            switch (n){
                case 1:
                    double z1 = a - b;
                    System.out.println(z1);
                    break;
                case 2:
                    double z2 = a + b;
                    System.out.println(z2);
                    break;
                case 3:
                    double z3 = a * b;
                    System.out.println(z3);
                    break;
                case 4:
                    double z4 = a/b;
                    System.out.println(z4);
                    break;
                case 5:
                    System.exit(0);
                    System.out.println("The calculator has finished working");
                    System.out.println("To make the calculator work run the program again");
                    break;
            }
        }
    }
}
