package by.jrr.homework1.operations;

import java.util.Random;

public class GeneratorRandomNumber {
    Random rnd;
    double [] arr;
    public double [] generatorOfRandomNumbers(int sizeOfArray, int rangeOfGenerators){
        rnd = new Random();
        arr = new double[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(rangeOfGenerators);
        }
        return arr;
    }
}
