package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public void pattern1(int num){
        for(int i =0 ; i<num; i++){
            for(int j = 0; j < i ; j++){
                System.out.print(" * ");
            }
        System.out.println("");
        }
    }

    public void pattern2(int num){
        for (int i =num ; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void pattern3(int num){
        for (int i = 1; i < num+1 ; i++){
            for (int j = (num-i)/2; j >= 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Pattern1 obj = new Pattern1();
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter Number : ");
        //int num = s.nextInt();
        int num = 5;
        float f = 4.5254163513351351351313651463521f;
        double d =  5.32636546416351365163513651354d;
        System.out.println(f+" "+d);
        obj.pattern1(num);
        obj.pattern2(num);
        obj.pattern3(num);
    }
}
