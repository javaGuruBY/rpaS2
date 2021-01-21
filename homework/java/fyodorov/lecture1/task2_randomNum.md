'''
package lv.javaguru.demo;
import java.util.Random;
public class RandomNumberGeneratorTest {
    public static void main (String[] args) {
        int Sum = 0;
        for (int i = 0; i < 3; i++) {
            Random randomGenerator = new Random();
            int RandomNumber = randomGenerator.nextInt(10);
            System.out.println(RandomNumber);
            Sum += RandomNumber;
        }
        System.out.println ("Сумма трех случайных чисел: " + Sum);
    }
}
