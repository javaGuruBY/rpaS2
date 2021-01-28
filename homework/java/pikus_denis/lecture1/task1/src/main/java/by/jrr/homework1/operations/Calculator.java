package by.jrr.homework1.operations;

public class Calculator {
    double sum;
    double sub;
    double mult = 1;
    double dev;

    public double addition(double ... numbers){
        for (Double num: numbers) {
            sum += num;
        }
        return sum;
    }

    public double subtraction(double ... numbers){
        sub = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sub -= numbers[i];
        }
        return sub;
    }

    public double multiplication(double ... numbers){

        for (Double num: numbers) {
            mult *= num;
        }
        return mult;
    }

    public double devision(double ... numbers) throws Exception {
        dev = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new Exception("Division by 0 is impossible!");
            }
            else {
                dev /= numbers[i];
            }
        }
        return dev;
    }
}
