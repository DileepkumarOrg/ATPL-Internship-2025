public class MathUtils {

    public int calculate(int num1, int num2){
        return num1*num2;
    }

    public double calculate(double num1, double num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        MathUtils multiplicationInt = new MathUtils();
        System.out.println(multiplicationInt.calculate(4,5));
        MathUtils multiplicationDouble = new MathUtils();
        System.out.println(multiplicationDouble.calculate(4.2, 5.2));
    }
}
