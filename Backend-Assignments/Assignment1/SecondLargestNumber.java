import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestNumber {
    public static int max(int arr[]){
        int fMax = 0;
        for (int i = 0; i < arr.length ; i++){
            if(fMax < arr[i]){
                fMax = arr[i];
            }
        }
        return fMax;
    }
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
        int firstMaximum = max(array);
        Arrays.sort(array);
        System.out.println(array[-1]);
        
    }
}
