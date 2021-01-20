package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArithmeticMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите два вещественных числа и необходимое арифметическое действие (add/div/mult/sub/rem)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        String opp = reader.readLine();
                switch (opp) {
            case "add":
                Addiction.calc(a, b);
                break;
            case "div":
                Division.calc(a, b);
                break;
            case "mult":
                Multiplication.calc(a,b);
                break;
            case "sub":
                Subtraction.calc(a, b);
                break;
            case "rem":
                Reminder.calc(a, b);
                break;
        }



    }
}
