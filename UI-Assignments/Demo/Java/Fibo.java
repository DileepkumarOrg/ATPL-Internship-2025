import java.util.Scanner;

public class Fibo {
    static int n1,n2,n3,i;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive number : ");
        int num = s.nextInt();
        if (num>0){
            if (num >=1) {
                System.out.print( 0+" ");
                n1 = 0;
            }
            if (num >=2){
                System.out.print(1+" ");
                n2 = 1;
            } 
            if (num > 2){
                for ( i = 2; i < num; i++){
                    n3 = n1+ n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.print(n3 +" ");
                }
            }
        }
        else System.out.println("Oops..! You are not enterning a Positive Number.. Rerun the code and enter a positive number");
    }
}
