import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int evenCount=0, oddCount=0;
        System.out.println("Enter array lenth : ");
        int arrayLength =  s.nextInt();
        int[] array = new int[arrayLength];
        for(int i= 0 ; i <arrayLength;i++){
            System.out.printf("Enter array[%d] : ",i);
            array[i] = s.nextInt();
            if (array[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.printf("Even Count : %d and Odd Count : %d",evenCount,oddCount);
    }
}
