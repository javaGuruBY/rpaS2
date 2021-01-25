package RandomGeneratorDemo;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int unboundRandom1 = randomGenerator.nextInt();
        int unboundRandom2 = randomGenerator.nextInt();
        int unboundRandom3 = randomGenerator.nextInt();
        System.out.println("unboundRandom 1 = " + unboundRandom1);
        System.out.println("unboundRandom 2 = " + unboundRandom2);
        System.out.println("unboundRandom 3 = " + unboundRandom3);

        System.out.println("Addition '+':");
        System.out.println("unboundRandom 1 + unboundRandom 2 + unboundRandom 3 = " + unboundRandom1 + " + " + unboundRandom2 + "+" +unboundRandom3 + " = " + (unboundRandom1+unboundRandom2+unboundRandom3));
    }
}
