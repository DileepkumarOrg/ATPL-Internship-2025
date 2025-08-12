import java.util.Scanner;

public class ThrowClass {
    public static void  isPositive(int num){
        if (num < 0){
            throw new IllegalArgumentException("** Number cannot be negative. **");
        }
        System.out.println("Valid Number");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = s.nextInt();
        isPositive(num);
    }
}
