package lecture_1Calc;

public class Calculate {


    public static double calculate (int a, int b, String command){
        double result = 0.0;
        switch (command){
            case "add":
                result = new Addition(a,b).catculate();
                break;
            case "div":
                result = new Division(a,b).catculate();
                break;
            case "mult":
                result = new Multiplication(a,b).catculate();
                break;
            case "rem":
                result = new Remalder(a,b).catculate();
                break;
            case "sub":
                result = new Subtraction(a,b).catculate();
                break;
            default:
                System.out.println("Operation not supported, default 0.0 has been returned");
                break;
        }
        return result;
    }

}
