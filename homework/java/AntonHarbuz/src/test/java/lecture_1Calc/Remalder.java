package lecture_1Calc;

public class Remalder {

    private int a;
    private int b;

    public Remalder(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int catculate(){
        return a % b;
    }
}
