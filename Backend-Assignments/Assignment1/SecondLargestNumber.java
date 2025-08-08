import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter length of an Array : ");
        int lengthArray = s.nextInt();
        int array[] = new int[lengthArray];
        for (int j = 0; j<lengthArray; j++){
            System.out.printf("Enter array[%d] : ", j);
            array[j] = s.nextInt();
        }
        s.close();
        Arrays.sort(array);
        for (int i = 0 ; i< lengthArray-1;i++){
            if(array[lengthArray-1-i]!=array[lengthArray-1-i-1]){
                System.out.println("Second Max Number : "+array[lengthArray-1-i-1]);
                break;
            }
        }
        
    }
}