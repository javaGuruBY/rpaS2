package by.jrr.start;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int a, b, c;

        a = rand.nextInt(10);
        b = rand.nextInt(10);
        c = rand.nextInt(10);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a + b + c);
    }
}
