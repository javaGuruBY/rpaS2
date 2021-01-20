'''
package lv.javaguru.demo;
import java.util.Scanner;

public class MathOperation {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        double firstNumb = scan.nextDouble();
        double secNum = scan.nextDouble();
        System.out.println("Наши числа: " + firstNumb + ", " + secNum);
        double sumResult = firstNumb + secNum;
        System.out.println("Сумма: " + sumResult);
        double substrResult = firstNumb - secNum;
        System.out.println("Вычитание: " + substrResult);
        double multResult = firstNumb * secNum;
        System.out.println("Умножение: " + multResult);
        double ostResult = firstNumb % secNum;
        System.out.println("Деление (остаток): " + ostResult);
        double a = firstNumb;
        double b = secNum;
        double divisRes = a / b;
        System.out.println("Деление: " + divisRes);
    }
}
