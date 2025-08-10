import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestNumber {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.println("Enter length of an numbersArray : ");
        int lengthnumbersArray = s.nextInt();
        int numbersArray[] = new int[lengthnumbersArray];
        for (int jIndex = 0; jIndex<lengthnumbersArray; jIndex++){
            System.out.printf("Enter numbersArray[%d] : ", jIndex);
            numbersArray[jIndex] = s.nextInt();
        }
        s.close();
        Arrays.sort(numbersArray);
        for (int index = 0 ; index< lengthnumbersArray-1;index++){
            if(numbersArray[lengthnumbersArray-1-index]!=numbersArray[lengthnumbersArray-1-index-1]){
                System.out.println("Second Max Number : "+numbersArray[lengthnumbersArray-1-index-1]);
                break;
            }
        }
        
    }
}

