import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int evenCount=0, oddCount=0;
        System.out.println("Enter numbersArray lenth : ");
        int numbersArrayLength =  s.nextInt();
        int[] numbersArray = new int[numbersArrayLength];
        for(int index= 0 ; index <numbersArrayLength;index++){
            System.out.printf("Enter numbersArray[%d] : ",index);
            numbersArray[index] = s.nextInt();
            if (numbersArray[index]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        s.close();
        System.out.printf("Even Count : %d and Odd Count : %d",evenCount,oddCount);
    }
}
