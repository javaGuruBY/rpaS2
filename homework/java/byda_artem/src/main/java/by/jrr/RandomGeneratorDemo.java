package by.jrr;

public class RandomGeneratorDemo {
    private int amount;
    private int sum;

    public RandomGeneratorDemo(int amount){
        this.amount = amount;
    }

    private int randValue(){
        return (int)Math.round(Math.random() * 100);
    }

    public void sumOfValues(){
        String str = "";
        for (int i = 0; i < amount; i++) {
            int a = randValue();
            str += a + " + ";
            sum += a;
        }
        System.out.println(str.substring(0, str.length()-2) + " = " + sum);
    }
}
