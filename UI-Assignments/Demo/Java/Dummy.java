import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = s.nextInt();
        for (int i = 1; i < num; i++){
            if (i%3 == 0 && i%5==0) System.out.println(i);
        }
    }
}
