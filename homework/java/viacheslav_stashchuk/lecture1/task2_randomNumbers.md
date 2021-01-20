'''
public class RandomGeneratorDemo {
    public static void main(String [] args){
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        System.out.println("Three random numbers:");
        System.out.println(a + ", " + b + ", " + c);
        double z = a + b + c;
        System.out.println("The sum of these numbers:");
        System.out.println(z);
        
    }
}
