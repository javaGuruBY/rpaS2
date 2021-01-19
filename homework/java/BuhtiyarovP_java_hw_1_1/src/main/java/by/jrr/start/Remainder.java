package by.jrr.start;

public class Remainder {

    private int a;
    private int b;

    public Remainder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(){
        return a % b;
    }
}
