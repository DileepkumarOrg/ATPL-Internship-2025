
import java.util.Arrays;
import java.util.Scanner;

public class SortingString {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter Length of Array : ");
        int lengthArray  = scannerObj.nextInt();
        String[] stringArray = new String[lengthArray];
        for (int index = 0; index < lengthArray; index++){
            System.out.printf("Enter stringArray[%d] : ",index);
            stringArray[index] = scannerObj.next();
        }
        scannerObj.close();
        Arrays.sort(stringArray);
        System.out.print("Ascending order  : [");
        for (String string : stringArray) {
            System.out.print(string+" ");
        }
        System.out.println("]");

        System.out.print("Descending Order : [");
        for(int index = lengthArray-1; index >= 0; index--){
            System.out.print(stringArray[index]+" ");
        }
        System.out.println("]");
    }
}


