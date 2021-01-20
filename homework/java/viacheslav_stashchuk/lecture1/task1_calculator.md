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
                    System.out.println(a-b);
                    break;
                case 2:
                    System.out.println(a+b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.println((double)a/b);
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
