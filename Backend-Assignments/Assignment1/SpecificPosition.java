import java.util.Scanner;
public class SpecificPosition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Length of Array : ");
        int arrayLength = s.nextInt();
        int[] array = new int[arrayLength];
        for(int i = 0; i <arrayLength;i++){
            System.out.printf("Enter array[%d] : ",i);
            array[i] = s.nextInt();
        }
        System.out.println("Element to insert : ");
        int insertedElement = s.nextInt();
        System.out.println("Enter Position : ");
        int Position = s.nextInt();
        int[] newArray =new int[arrayLength+1];
        for(int i = 0 ; i < arrayLength+1; i++){
            int  j =i;
            if(Position==i){
                newArray[i]=insertedElement;
            }
            else if(i>Position){
                newArray[i]=array[j-1];
            }
            else newArray[i]=array[i];
        }
        for(int i : newArray){
            System.out.print(i +" ");
        }
    }
}
