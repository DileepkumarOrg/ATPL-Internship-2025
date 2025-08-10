import java.util.Scanner;
public class SpecificPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length of Array : ");
        int arrayLength = s.nextInt();
        int[] array = new int[arrayLength];

        for(int index = 0; index <arrayLength;index++){
            System.out.printf("Enter array[%d] : ",index);
            array[index] = s.nextInt();
        }
        System.out.println("Element to insert : ");
        int insertedElement = s.nextInt();
        System.out.println("Enter Position : ");
        int Position = s.nextInt();
        s.close();
        int[] newArray =new int[arrayLength+1];

        for(int index = 0 ; index < arrayLength+1; index++){
            int  temp =index;
            if(Position==index){
                newArray[index]=insertedElement;
            }
            else if(index>Position){
                newArray[index]=array[temp-1];
            }
            else newArray[index]=array[index];
        }
        
        for(int num : newArray){
            System.out.print(num +" ");
        }
    }
}
